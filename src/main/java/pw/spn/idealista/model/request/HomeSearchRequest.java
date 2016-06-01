package pw.spn.idealista.model.request;

import java.util.Arrays;
import java.util.stream.Collectors;
import okhttp3.HttpUrl;
import pw.spn.idealista.RequestParameter;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.home.FurnishedType;
import pw.spn.idealista.model.home.HomeAmenity;
import pw.spn.idealista.model.home.HomeStatus;
import pw.spn.idealista.model.home.HomeType;

public class HomeSearchRequest extends AbstractIdealistaSearchRequest {

    private HomeType[] homeTypes = HomeType.values();
    private int[] bedrooms;
    private int[] bathrooms;
    private HomeAmenity[] amenities;
    private FurnishedType furnishedType;
    private HomeStatus homeStatus;

    @Override
    void validateInternal() throws InvalidRequestException {
        if (invalidValueExists(bedrooms)) {
            throw new InvalidRequestException("Numbers of bedrooms must be between 1 and 4");
        }
        if (invalidValueExists(bathrooms)) {
            throw new InvalidRequestException("Numbers of bathrooms must be between 1 and 4");
        }
    }

    private boolean invalidValueExists(int[] parameters) {
        return parameters != null && Arrays.stream(parameters).anyMatch(value -> (value < 1 || value > 4));
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.HOMES;
    }

    @Override
    void buildURLInternal(HttpUrl.Builder builder) {
        if (homeTypes != null) {
            Arrays.stream(homeTypes).forEach(type -> builder.addQueryParameter(type.getValue(), "true"));
        }
        if (bedrooms != null) {
            builder.addQueryParameter(RequestParameter.BEDROOMS, arrayToString(bedrooms));
        }
        if (bathrooms != null) {
            builder.addQueryParameter(RequestParameter.BATHROOMS, arrayToString(bathrooms));
        }
        if (amenities != null) {
            Arrays.stream(amenities).forEach(amenity -> builder.addQueryParameter(amenity.getValue(), "true"));
        }
        if (furnishedType != null) {
            builder.addQueryParameter(RequestParameter.FURNISHED, furnishedType.getValue());
        }
        if (homeStatus != null) {
            builder.addQueryParameter(RequestParameter.STATUS, homeStatus.getValue());
        }
    }

    private String arrayToString(int[] array) {
        return Arrays.stream(array).boxed().map(i -> i.toString()).collect(Collectors.joining(","));
    }

    public HomeType[] getHomeTypes() {
        return homeTypes;
    }

    public void setHomeTypes(HomeType[] homeTypes) {
        this.homeTypes = homeTypes;
    }

    public int[] getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int[] bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int[] getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int[] bathrooms) {
        this.bathrooms = bathrooms;
    }

    public HomeAmenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(HomeAmenity[] amenities) {
        this.amenities = amenities;
    }

    public FurnishedType getFurnishedType() {
        return furnishedType;
    }

    public void setFurnishedType(FurnishedType furnishedType) {
        this.furnishedType = furnishedType;
    }

    public HomeStatus getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(HomeStatus homeStatus) {
        this.homeStatus = homeStatus;
    }

}
