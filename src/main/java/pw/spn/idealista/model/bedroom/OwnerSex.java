package pw.spn.idealista.model.bedroom;

public enum OwnerSex {
    MALE("M"),
    FEMALE("F"),
    INDIFFERENT("I");

    private final String value;

    OwnerSex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
