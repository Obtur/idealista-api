package pw.spn.idealista.model.office;

import pw.spn.idealista.RequestParameter;

public enum OfficeAmenity {
    ACCESS_ALL_DAY(RequestParameter.ACCESS_ALL_DAY),
    SECURITY(RequestParameter.SECURITY),
    GARAGE(RequestParameter.GARAGE),
    INDEPENDENT_HOT_WATER(RequestParameter.INDEPENDENT_HOT_WATER),
    INDEPENDENT_HEATING(RequestParameter.INDEPENDENT_HEATING),
    ELEVATOR(RequestParameter.ELEVATOR),
    AIR_CONDITIONING(RequestParameter.AIR_CONDITIONING);

    private final String value;

    OfficeAmenity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
