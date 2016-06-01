package pw.spn.idealista.model.common;

public enum DateInterval {
    LAST_WEEK("W"),
    LAST_MONTH("M"),
    LAST_48_HOURS("T");

    private final String value;

    DateInterval(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
