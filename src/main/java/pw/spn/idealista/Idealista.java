package pw.spn.idealista;

import pw.spn.idealista.model.IdealistaSearchResponse;
import pw.spn.idealista.model.request.AbstractIdealistaSearchRequest;

public class Idealista {

    private final String apiKey;

    public Idealista(String apiKey) {
        this.apiKey = apiKey;
    }

    public IdealistaSearchResponse search(AbstractIdealistaSearchRequest searchRequest) {
        validateRequest(searchRequest);
        waitIfNeed();

        return null;
    }

    private void validateRequest(AbstractIdealistaSearchRequest searchRequest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void waitIfNeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
