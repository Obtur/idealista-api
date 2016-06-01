package pw.spn.idealista.model.home;

import pw.spn.idealista.RequestParameter;

public enum HomeAmenity {
    GARAGE(RequestParameter.GARAGE),
    ELEVATOR(RequestParameter.ELEVATOR),
    SWIMMING_POOL(RequestParameter.SWIMMING_POOL),
    AIR_CONDITIONING(RequestParameter.AIR_CONDITIONING),
    TERRANCE(RequestParameter.TERRANCE),
    STORE_ROOM(RequestParameter.STOREROOM),
    CLOTHESLINE_SPACE(RequestParameter.CLOTHESLINE_SPACE),
    BUILTIN_WARDROBES(RequestParameter.BUILTIN_WARDROBES),
    INDEPENDENT_HOT_WATER(RequestParameter.INDEPENDENT_HOT_WATER),
    INDEPENDENT_HEATING(RequestParameter.INDEPENDENT_HEATING);

    private final String value;

    HomeAmenity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
