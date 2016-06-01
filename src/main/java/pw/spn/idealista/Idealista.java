package pw.spn.idealista;

import okhttp3.HttpUrl;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.request.AbstractIdealistaSearchRequest;
import pw.spn.idealista.model.response.IdealistaSearchResponse;

public class Idealista {

    private static final HttpUrl API_ENDPOINT = HttpUrl.parse("http://www.idealista.com/labs/api/2/search");

    private final String apiKey;

    public Idealista(String apiKey) {
        this.apiKey = apiKey;
    }

    public IdealistaSearchResponse search(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException {
        validateRequest(searchRequest);
        waitIfNeed();
        makeRequest(searchRequest);
        return null;
    }

    private void validateRequest(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException {
        searchRequest.validate();
    }

    private void waitIfNeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void makeRequest(AbstractIdealistaSearchRequest searchRequest) {
        HttpUrl url = buildUrl(searchRequest);
    }

    private HttpUrl buildUrl(AbstractIdealistaSearchRequest searchRequest) {
        HttpUrl.Builder builder = API_ENDPOINT.newBuilder();
        builder.addQueryParameter(RequestParameter.APIKEY, apiKey);
        searchRequest.buildURL(builder);
        return builder.build();
    }

}
