package pw.spn.idealista.model.bedroom;

public enum OwnerSex {
    MALE("M"),
    FEMALE("F"),
    INDIFFERENT("X");

    private final String value;

    OwnerSex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
