package pw.spn.idealista.model.common;

public enum Country {
    SPAIN("es"),
    ITALY("id"),
    PORTUGAL("pt");

    private final String value;

    Country(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
