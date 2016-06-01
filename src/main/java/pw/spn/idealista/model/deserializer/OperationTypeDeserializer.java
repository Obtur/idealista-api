package pw.spn.idealista.model.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import pw.spn.idealista.model.common.OperationType;

import static pw.spn.idealista.model.common.OperationType.fromCode;

public class OperationTypeDeserializer extends JsonDeserializer<OperationType> {

    @Override
    public OperationType deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        String value = jp.getCodec().readValue(jp, String.class);
        return fromCode(value);
    }

}
