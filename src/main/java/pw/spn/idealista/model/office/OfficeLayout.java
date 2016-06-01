package pw.spn.idealista.model.office;

public enum OfficeLayout {
    OPEN("open"),
    CLOSE("close");

    private final String value;

    OfficeLayout(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
