package pw.spn.idealista.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import pw.spn.idealista.model.common.OperationType;
import pw.spn.idealista.model.common.VideoType;
import pw.spn.idealista.model.deserializer.OperationTypeDeserializer;
import pw.spn.idealista.model.deserializer.VideoTypeDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdealistaSearchResult {

    private String address;
    private boolean agency;
    private String agentLogo;
    private int bathrooms;
    private String country;
    private String description;
    private int distance;
    private String district;
    private boolean exterior;
    private int floor;
    private boolean hasVideo;
    private double latitude;
    private double longitude;
    private String municipality;
    private String neighborhood;
    private int numPhotos;
    @JsonDeserialize(using = OperationTypeDeserializer.class)
    private OperationType operation;
    private float price;
    private String propertyCode;
    private String propertyTypeCode;
    private String province;
    private String region;
    private int rooms;
    private boolean showAddress;
    private float size;
    private String subregion;
    private String thumbnail;
    private String url;
    private String userCode;
    @JsonDeserialize(using = VideoTypeDeserializer.class)
    private VideoType videoType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAgency() {
        return agency;
    }

    public void setAgency(boolean agency) {
        this.agency = agency;
    }

    public String getAgentLogo() {
        return agentLogo;
    }

    public void setAgentLogo(String agentLogo) {
        this.agentLogo = agentLogo;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getNumPhotos() {
        return numPhotos;
    }

    public void setNumPhotos(int numPhotos) {
        this.numPhotos = numPhotos;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getPropertyTypeCode() {
        return propertyTypeCode;
    }

    public void setPropertyTypeCode(String propertyTypeCode) {
        this.propertyTypeCode = propertyTypeCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isShowAddress() {
        return showAddress;
    }

    public void setShowAddress(boolean showAddress) {
        this.showAddress = showAddress;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public VideoType getVideoType() {
        return videoType;
    }

    public void setVideoType(VideoType videoType) {
        this.videoType = videoType;
    }

}
