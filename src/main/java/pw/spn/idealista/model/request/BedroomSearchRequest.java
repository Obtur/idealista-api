package pw.spn.idealista.model.request;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.bedroom.BedroomAmenity;
import pw.spn.idealista.model.bedroom.OwnerSex;
import pw.spn.idealista.model.common.PropertyType;

public class BedroomSearchRequest extends AbstractIdealistaSearchRequest {

    private BedroomAmenity[] bedroomAmenities;
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

    public BedroomAmenity[] getBedroomAmenities() {
        return bedroomAmenities;
    }

    public void setBedroomAmenities(BedroomAmenity[] bedroomAmenities) {
        this.bedroomAmenities = bedroomAmenities;
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
