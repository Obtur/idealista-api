package pw.spn.idealista.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdealistaSearchResponse {

    private int actualPage;
    private int itemsPerPage;
    private int lowerRangePosition;
    private boolean paginable;
    private String resultSummary;
    private int total;
    private int totalPages;
    private int upperRangePosition;
    private List<IdealistaSearchResult> elementList = Collections.emptyList();

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public int getLowerRangePosition() {
        return lowerRangePosition;
    }

    public void setLowerRangePosition(int lowerRangePosition) {
        this.lowerRangePosition = lowerRangePosition;
    }

    public boolean isPaginable() {
        return paginable;
    }

    public void setPaginable(boolean paginable) {
        this.paginable = paginable;
    }

    public String getResultSummary() {
        return resultSummary;
    }

    public void setResultSummary(String resultSummary) {
        this.resultSummary = resultSummary;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getUpperRangePosition() {
        return upperRangePosition;
    }

    public void setUpperRangePosition(int upperRangePosition) {
        this.upperRangePosition = upperRangePosition;
    }

    public List<IdealistaSearchResult> getElementList() {
        return Collections.unmodifiableList(elementList);
    }

    public void setElementList(List<IdealistaSearchResult> elementList) {
        this.elementList = elementList;
    }

}
