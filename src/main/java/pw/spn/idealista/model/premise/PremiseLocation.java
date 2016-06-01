package pw.spn.idealista.model.premise;

public enum PremiseLocation {
    STREET("street"),
    MEZZANINE("mezzanine"),
    SHOPPING_CENTER("shoppingcenter");

    private final String value;

    PremiseLocation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
