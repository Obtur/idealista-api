package pw.spn.idealista.model.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import pw.spn.idealista.model.common.VideoType;

public class VideoTypeDeserializer extends JsonDeserializer<VideoType> {

    @Override
    public VideoType deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);

        switch (value) {
            case "P":
                return VideoType.PERSONAL;
            case "I":
                return VideoType.MADE_BY_IDEALISTA;
            default:
                return VideoType.NO_VIDEO;
        }
    }

}
