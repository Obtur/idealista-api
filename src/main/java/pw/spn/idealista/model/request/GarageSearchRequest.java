package pw.spn.idealista.model.request;

import java.util.Arrays;
import okhttp3.HttpUrl;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.garage.GarageAmenity;

public class GarageSearchRequest extends AbstractIdealistaSearchRequest {

    private GarageAmenity[] amenities;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.GARAGES;
    }

    @Override
    void buildURLInternal(HttpUrl.Builder builder) {
        if (amenities != null) {
            Arrays.stream(amenities).forEach(amenity -> builder.addQueryParameter(amenity.getValue(), "true"));
        }
    }

    public GarageAmenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(GarageAmenity[] amenities) {
        this.amenities = amenities;
    }
}
