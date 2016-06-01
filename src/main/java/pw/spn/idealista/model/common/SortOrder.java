package pw.spn.idealista.model.common;

public enum SortOrder {
    DISTANCE("distance"),
    SIZE("size"),
    ROOMS("rooms"),
    FLOOR("floor"),
    RATIO_EUR_M2("ratioeurm2"),
    PRICE("price"),
    STREET("street"),
    PHOTOS("photos");

    private final String value;

    SortOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
