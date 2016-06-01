package pw.spn.idealista;

import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.response.IdealistaSearchResponse;
import pw.spn.idealista.model.request.AbstractIdealistaSearchRequest;

public class Idealista {

    private final String apiKey;

    public Idealista(String apiKey) {
        this.apiKey = apiKey;
    }

    public IdealistaSearchResponse search(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException {
        validateRequest(searchRequest);
        waitIfNeed();

        return null;
    }

    private void validateRequest(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException {
        searchRequest.validate();
    }

    private void waitIfNeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
