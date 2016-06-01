package pw.spn.idealista.model.home;

public enum FurnishedType {
    FURNISHED("yes"),
    NOT_FURNISHED("no"),
    ONLY_KITCHEN("onlyKitchen");

    private final String value;

    FurnishedType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
