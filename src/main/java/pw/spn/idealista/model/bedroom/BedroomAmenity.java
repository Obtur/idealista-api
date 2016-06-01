package pw.spn.idealista.model.bedroom;

import pw.spn.idealista.RequestParameter;

public enum BedroomAmenity {
    SMOKERS_ALLOWED(RequestParameter.NO_SMOKERS, false),
    GAY_PARTNERS(RequestParameter.GAY_PARTNERS, true),
    PETS_ALLOWED(RequestParameter.NO_PETS_ALOWED, false),
    OWNER_IS_SMOKER(RequestParameter.SMOKER, true),
    OWNER_HAS_PETS(RequestParameter.PETS, true);

    private final String name;
    private final boolean value;

    BedroomAmenity(String name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {
        return value;
    }
}
