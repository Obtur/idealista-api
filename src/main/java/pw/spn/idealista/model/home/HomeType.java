package pw.spn.idealista.model.home;

import pw.spn.idealista.RequestParameter;

public enum HomeType {
    FLAT(RequestParameter.FLAT),
    PENTHOUSE(RequestParameter.PENTHOUSE),
    DUPLEX(RequestParameter.DUPLEX),
    STUDIO(RequestParameter.STUDIO),
    CHALET(RequestParameter.CHALET);

    private final String value;

    HomeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
