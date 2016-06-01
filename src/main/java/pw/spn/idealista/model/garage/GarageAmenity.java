package pw.spn.idealista.model.garage;

import pw.spn.idealista.RequestParameter;

public enum GarageAmenity {
    SECURITY(RequestParameter.SECURITY),
    AUTOMATIC_DOOR(RequestParameter.AUTOMATIC_DOOR),
    MOTORCYCLE_PARKING(RequestParameter.MOTORCYCLE_PARKING);

    private final String value;

    GarageAmenity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
