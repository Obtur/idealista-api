package pw.spn.idealista.model.request;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.garage.GarageAmenity;

public class GarageSearchRequest extends AbstractIdealistaSearchRequest {

    private GarageAmenity[] garageAmenities;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.GARAGES;
    }

    public GarageAmenity[] getGarageAmenities() {
        return garageAmenities;
    }

    public void setGarageAmenities(GarageAmenity[] garageAmenities) {
        this.garageAmenities = garageAmenities;
    }
}
