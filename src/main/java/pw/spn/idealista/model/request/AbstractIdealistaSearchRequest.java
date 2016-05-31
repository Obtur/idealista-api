package pw.spn.idealista.model.request;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.common.DateInterval;
import pw.spn.idealista.model.common.Location;
import pw.spn.idealista.model.common.OperationType;
import pw.spn.idealista.model.common.PropertyType;
import pw.spn.idealista.model.common.SortOrder;
import pw.spn.idealista.model.common.SortType;

public abstract class AbstractIdealistaSearchRequest {

    private OperationType operationType;
    private Location location;

    private int maxItems = 50;
    private int minPrice = 0;
    private int maxPrice = Integer.MAX_VALUE;
    private int minSize = 0;
    private int maxSize = Integer.MAX_VALUE;
    private SortOrder sortOrder = SortOrder.PRICE;
    private SortType sortType = SortType.ASC;
    private DateInterval dateInterval;
    private boolean onlyWithPictures = false;
    private boolean onlyWithProfessionalVideo = false;

    public void validate() throws InvalidRequestException {
        if (location == null) {
            throw new InvalidRequestException("Location can not be empty");
        }
        validateInternal();
    }

    public abstract PropertyType getPropertyType();

    abstract void validateInternal() throws InvalidRequestException;

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public void setDateInterval(DateInterval dateInterval) {
        this.dateInterval = dateInterval;
    }

    public boolean isOnlyWithPictures() {
        return onlyWithPictures;
    }

    public void setOnlyWithPictures(boolean onlyWithPictures) {
        this.onlyWithPictures = onlyWithPictures;
    }

    public boolean isOnlyWithProfessionalVideo() {
        return onlyWithProfessionalVideo;
    }

    public void setOnlyWithProfessionalVideo(boolean onlyWithProfessionalVideo) {
        this.onlyWithProfessionalVideo = onlyWithProfessionalVideo;
    }
}
