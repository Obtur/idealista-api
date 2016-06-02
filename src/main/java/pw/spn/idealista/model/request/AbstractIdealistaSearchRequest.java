package pw.spn.idealista.model.request;

import okhttp3.HttpUrl;
import pw.spn.idealista.RequestParameter;
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

    private int numPage = 1;
    private int maxItems = 50;
    private int minPrice;
    private int maxPrice;
    private int minSize;
    private int maxSize;
    private SortOrder sortOrder = SortOrder.PRICE;
    private SortType sortType = SortType.ASC;
    private DateInterval dateInterval;
    private boolean onlyWithPictures = false;
    private boolean onlyWithProfessionalVideo = false;

    public void validate() throws InvalidRequestException {
        if (location == null) {
            throw new InvalidRequestException("Location can not be empty");
        }
        if (operationType == null) {
            throw new InvalidRequestException("Operation type can not be empty");
        }
        if (PropertyType.BEDROOMS == getPropertyType() && OperationType.BUY == operationType) {
            throw new InvalidRequestException("Invalid operationType for bedrooms search");
        }
        if (numPage < 1) {
            throw new InvalidRequestException("numPage must be greater than 0");
        }
        if (maxItems < 0) {
            throw new InvalidRequestException("maxItems can not be negative");
        }
        if (minPrice < 0) {
            throw new InvalidRequestException("minPrice can not be negative");
        }
        if (maxPrice < 0) {
            throw new InvalidRequestException("maxPrice can not be negative");
        }
        if (minSize < 0) {
            throw new InvalidRequestException("minSize can not be negative");
        }
        if (maxSize < 0) {
            throw new InvalidRequestException("maxSize can not be negative");
        }
        validateInternal();
    }

    abstract void validateInternal() throws InvalidRequestException;

    public abstract PropertyType getPropertyType();

    public void buildURL(HttpUrl.Builder builder) {
        builder.addQueryParameter(RequestParameter.PROPERTY_TYPE, getPropertyType().name().toLowerCase());
        builder.addQueryParameter(RequestParameter.OPERATION, operationType.getCode());
        builder.addQueryParameter(RequestParameter.CENTER, location.getLatitude() + "," + location.getLongitude());
        builder.addQueryParameter(RequestParameter.DISTANCE, String.valueOf(location.getDistance()));
        builder.addQueryParameter(RequestParameter.COUNTRY, location.getCountry().getValue());
        if (numPage != 0) {
            builder.addQueryParameter(RequestParameter.NUM_PAGE, String.valueOf(numPage));
        }
        if (maxItems != 0) {
            builder.addQueryParameter(RequestParameter.MAX_ITEMS, String.valueOf(maxItems));
        }
        if (minPrice != 0) {
            builder.addQueryParameter(RequestParameter.MIN_PRICE, String.valueOf(minPrice));
        }
        if (maxPrice != 0) {
            builder.addQueryParameter(RequestParameter.MAX_PRICE, String.valueOf(maxPrice));
        }
        if (minSize != 0) {
            builder.addQueryParameter(RequestParameter.MIN_SIZE, String.valueOf(minSize));
        }
        if (maxSize != 0) {
            builder.addQueryParameter(RequestParameter.MAX_SIZE, String.valueOf(maxSize));
        }
        if (sortOrder != null) {
            builder.addQueryParameter(RequestParameter.ORDER, sortOrder.getValue());
        }
        if (sortType != null) {
            builder.addQueryParameter(RequestParameter.SORT, sortType.getValue());
        }
        if (dateInterval != null) {
            builder.addQueryParameter(RequestParameter.SINCE_DATE, dateInterval.getValue());
        }
        builder.addQueryParameter(RequestParameter.PICTURES, String.valueOf(onlyWithPictures));
        builder.addQueryParameter(RequestParameter.PROFESSIONAL_VIDEO, String.valueOf(onlyWithProfessionalVideo));

        buildURLInternal(builder);
    }

    abstract void buildURLInternal(HttpUrl.Builder builder);

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

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
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
