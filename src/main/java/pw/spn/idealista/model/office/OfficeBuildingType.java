package pw.spn.idealista.model.office;

public enum OfficeBuildingType {
    EXCLUSIVE("exclusive"),
    MIXED("mixed");

    private final String value;

    OfficeBuildingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
