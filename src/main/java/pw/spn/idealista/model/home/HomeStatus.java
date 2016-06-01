package pw.spn.idealista.model.home;

public enum HomeStatus {
    GOOD("good"),
    RENEW("renew"),
    NEW_DEVELOPMENT("newdevelopment");

    private final String value;

    HomeStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
