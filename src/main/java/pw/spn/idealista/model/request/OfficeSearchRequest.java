package pw.spn.idealista.model.request;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.office.OfficeAmenity;
import pw.spn.idealista.model.office.OfficeBuildingType;
import pw.spn.idealista.model.office.OfficeLayout;

public class OfficeSearchRequest extends AbstractIdealistaSearchRequest {

    private OfficeAmenity[] officeAmenities;
    private OfficeLayout officeLayout;
    private OfficeBuildingType officeBuildingType;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.OFFICES;
    }

    public OfficeAmenity[] getOfficeAmenities() {
        return officeAmenities;
    }

    public void setOfficeAmenities(OfficeAmenity[] officeAmenities) {
        this.officeAmenities = officeAmenities;
    }

    public OfficeLayout getOfficeLayout() {
        return officeLayout;
    }

    public void setOfficeLayout(OfficeLayout officeLayout) {
        this.officeLayout = officeLayout;
    }

    public OfficeBuildingType getOfficeBuildingType() {
        return officeBuildingType;
    }

    public void setOfficeBuildingType(OfficeBuildingType officeBuildingType) {
        this.officeBuildingType = officeBuildingType;
    }

}
