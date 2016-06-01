package pw.spn.idealista.model.request;

import java.util.Arrays;
import okhttp3.HttpUrl;
import pw.spn.idealista.RequestParameter;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.premise.PremiseAmenity;
import pw.spn.idealista.model.premise.PremiseLocation;

public class PremiseSearchRequest extends AbstractIdealistaSearchRequest {

    private PremiseLocation premiseLocation;
    private PremiseAmenity[] amenities;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.PREMISES;
    }

    @Override
    void buildURLInternal(HttpUrl.Builder builder) {
        if (premiseLocation != null) {
            builder.addQueryParameter(RequestParameter.LOCATION, premiseLocation.getValue());
        }
        if (amenities != null) {
            Arrays.stream(amenities).forEach(amenity -> builder.addQueryParameter(amenity.getValue(), "true"));
        }
    }

    public PremiseLocation getPremiseLocation() {
        return premiseLocation;
    }

    public void setPremiseLocation(PremiseLocation premiseLocation) {
        this.premiseLocation = premiseLocation;
    }

    public PremiseAmenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(PremiseAmenity[] amenities) {
        this.amenities = amenities;
    }

}
