package pw.spn.idealista;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pw.spn.idealista.exception.IdealistaException;
import pw.spn.idealista.exception.InvalidRequestException;
import pw.spn.idealista.model.request.AbstractIdealistaSearchRequest;
import pw.spn.idealista.model.response.IdealistaSearchResponse;

public class Idealista {

    private static final HttpUrl API_ENDPOINT = HttpUrl.parse("http://www.idealista.com/labs/api/2/search");

    private final String apiKey;
    private OkHttpClient httpClient;
    private ObjectMapper objectMapper;
    private AtomicLong lastRequestTime;

    public Idealista(String apiKey) {
        this.apiKey = apiKey;
    }

    public IdealistaSearchResponse search(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException,
            IOException, IdealistaException {
        initIfNeed();
        validateRequest(searchRequest);
        waitIfNeed();
        Response response = makeRequest(searchRequest);
        String responseJson = response.body().string();
        if (response.isSuccessful()) {
            return objectMapper.readValue(responseJson, IdealistaSearchResponse.class);
        }
        throw new IdealistaException(responseJson);
    }

    private void initIfNeed() {
        if (httpClient == null) {
            httpClient = new OkHttpClient();
        }
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
    }

    private void validateRequest(AbstractIdealistaSearchRequest searchRequest) throws InvalidRequestException {
        searchRequest.validate();
    }

    private void waitIfNeed() {
        long now = System.currentTimeMillis();
        if (lastRequestTime == null) {
            lastRequestTime = new AtomicLong(now);
            return;
        }
        long diff = now - lastRequestTime.get();
        long timeout = TimeUnit.SECONDS.toMillis(1);
        if (diff < timeout) {
            try {
                Thread.sleep(timeout - diff);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        lastRequestTime.set(now);
    }

    private Response makeRequest(AbstractIdealistaSearchRequest searchRequest) throws IOException {
        HttpUrl url = buildUrl(searchRequest);
        Request request = new Request.Builder().url(url).build();
        return httpClient.newCall(request).execute();
    }

    private HttpUrl buildUrl(AbstractIdealistaSearchRequest searchRequest) {
        HttpUrl.Builder builder = API_ENDPOINT.newBuilder();
        builder.addQueryParameter(RequestParameter.APIKEY, apiKey);
        searchRequest.buildURL(builder);
        return builder.build();
    }

    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
