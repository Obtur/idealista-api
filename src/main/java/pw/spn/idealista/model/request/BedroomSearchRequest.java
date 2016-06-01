package pw.spn.idealista.model.request;

import java.util.Arrays;
import okhttp3.HttpUrl;
import pw.spn.idealista.RequestParameter;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.bedroom.BedroomAmenity;
import pw.spn.idealista.model.bedroom.OwnerSex;
import pw.spn.idealista.model.common.PropertyType;

public class BedroomSearchRequest extends AbstractIdealistaSearchRequest {

    private BedroomAmenity[] amenities;
    private OwnerSex sex = OwnerSex.INDIFFERENT;
    private int housemates;

    @Override
    void validateInternal() throws InvalidRequestException {
        if (housemates != 0 && (housemates < 2 || housemates > 4)) {
            throw new InvalidRequestException("Housemates capacity must be between 2 and 4");
        }
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.BEDROOMS;
    }

    @Override
    void buildURLInternal(HttpUrl.Builder builder) {
        if (amenities != null) {
            Arrays.stream(amenities).forEach(amenity -> builder.addQueryParameter(amenity.getName(),
                    String.valueOf(amenity.getValue())));
        }
        if (sex != null) {
            builder.addQueryParameter(RequestParameter.SEX, sex.getValue());
        }
        if (housemates != 0) {
            builder.addQueryParameter(RequestParameter.HOUSEMATES, String.valueOf(housemates));
        }
    }

    public BedroomAmenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(BedroomAmenity[] amenities) {
        this.amenities = amenities;
    }

    public OwnerSex getSex() {
        return sex;
    }

    public void setSex(OwnerSex sex) {
        this.sex = sex;
    }

    public int getHousemates() {
        return housemates;
    }

    public void setHousemates(int housemates) {
        this.housemates = housemates;
    }

}
