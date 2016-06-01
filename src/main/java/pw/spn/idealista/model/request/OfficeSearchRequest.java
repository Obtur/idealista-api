package pw.spn.idealista.model.request;

import java.util.Arrays;
import okhttp3.HttpUrl;
import pw.spn.idealista.RequestParameter;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.office.OfficeAmenity;
import pw.spn.idealista.model.office.OfficeBuildingType;
import pw.spn.idealista.model.office.OfficeLayout;

public class OfficeSearchRequest extends AbstractIdealistaSearchRequest {

    private OfficeAmenity[] amenities;
    private OfficeLayout layout;
    private OfficeBuildingType buildingType;

    @Override
    void validateInternal() throws InvalidRequestException {
    }

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.OFFICES;
    }

    @Override
    void buildURLInternal(HttpUrl.Builder builder) {
        if (amenities != null) {
            Arrays.stream(amenities).forEach(amenity -> builder.addQueryParameter(amenity.getValue(), "true"));
        }
        if (layout != null) {
            builder.addQueryParameter(RequestParameter.LAYOUT, layout.getValue());
        }
        if (buildingType != null) {
            builder.addQueryParameter(RequestParameter.TYPE_BUILDING, buildingType.getValue());
        }
    }

    public OfficeAmenity[] getAmenities() {
        return amenities;
    }

    public void setAmenities(OfficeAmenity[] amenities) {
        this.amenities = amenities;
    }

    public OfficeLayout getLayout() {
        return layout;
    }

    public void setLayout(OfficeLayout layout) {
        this.layout = layout;
    }

    public OfficeBuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(OfficeBuildingType buildingType) {
        this.buildingType = buildingType;
    }

}
