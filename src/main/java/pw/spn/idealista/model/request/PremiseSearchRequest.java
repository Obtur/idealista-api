package pw.spn.idealista.model.request;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.premise.PremiseAmenity;
import pw.spn.idealista.model.premise.PremiseLocation;

public class PremiseSearchRequest extends AbstractIdealistaSearchRequest {

    private PremiseLocation premiseLocation;
    private PremiseAmenity[] premiseAmenities;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.PREMISES;
    }

    public PremiseLocation getPremiseLocation() {
        return premiseLocation;
    }

    public void setPremiseLocation(PremiseLocation premiseLocation) {
        this.premiseLocation = premiseLocation;
    }

    public PremiseAmenity[] getPremiseAmenities() {
        return premiseAmenities;
    }

    public void setPremiseAmenities(PremiseAmenity[] premiseAmenities) {
        this.premiseAmenities = premiseAmenities;
    }

}
