package pw.spn.idealista.model.common;

public enum OperationType {
    RENT("A"),
    BUY("V");

    private final String code;

    OperationType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static OperationType fromCode(String code) {
        for (OperationType value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }
}
