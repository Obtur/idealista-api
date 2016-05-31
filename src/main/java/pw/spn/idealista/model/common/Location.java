package pw.spn.idealista.model.common;

public class Location {

    private final double latitude;
    private final double longitude;
    private final long distance;

    public Location(double latitude, double longitude, long distance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
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
