package pw.spn.idealista.model.common;

public class Location {

    private final Country country;
    private final double latitude;
    private final double longitude;
    private final long distance;

    public Location(Country country, double latitude, double longitude, long distance) {
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
    }

    public Country getCountry() {
        return country;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getDistance() {
        return distance;
    }
}
