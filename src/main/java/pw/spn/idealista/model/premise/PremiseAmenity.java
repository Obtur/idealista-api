package pw.spn.idealista.model.premise;

import pw.spn.idealista.RequestParameter;

public enum PremiseAmenity {
    IS_CORNER(RequestParameter.CORNER),
    AIR_CONDITIONING(RequestParameter.AIR_CONDITIONING),
    SMOKE_VENTILATION(RequestParameter.SMOKE_VENTILATION),
    INDEPENDENT_HOT_WATER(RequestParameter.INDEPENDENT_HOT_WATER),
    INDEPENDENT_HEATING(RequestParameter.INDEPENDENT_HEATING),
    ACCESS_ALL_DAY(RequestParameter.ACCESS_ALL_DAY);

    private final String value;

    PremiseAmenity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
