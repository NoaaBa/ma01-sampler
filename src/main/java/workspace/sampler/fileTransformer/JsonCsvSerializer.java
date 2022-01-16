package workspace.sampler.fileTransformer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import junit.runner.Version;
import workspace.sampler.Objects.SampledPerson;

import java.io.IOException;
import java.util.Set;

public class JsonCsvSerializer extends JsonSerializer<SampledPerson> {

    public JsonCsvSerializer() {
        this(null);
    }

    public JsonCsvSerializer(Class<SampledPerson> t) {
        //super(t);
    }

    public static void jsonToCsvSerialization(Set<SampledPerson> sampledPersonSet) throws JsonProcessingException {
        /*ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule("SampledPersonSerializer", new Version(1, 0, 0, null, null, null));
        module.addSerializer(SampledPerson.class, new JsonCsvSerializer());
        mapper.registerModule(module);
        SampledPerson sampledPerson = new SampledPerson(sampledPersonSet);
        String carJson = mapper.writeValueAsString(sampledPerson);*/
    }

    @Override
    public void serialize(SampledPerson sampledPerson, JsonGenerator jsonGenerator, SerializerProvider serializer) throws IOException {
        jsonGenerator.useDefaultPrettyPrinter();
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("mda_code", sampledPerson.getMdaCode());
        jsonGenerator.writeStringField("id_num", sampledPerson.getIdNum());
        jsonGenerator.writeStringField("id_type", String.valueOf(sampledPerson.getIdType()));
        jsonGenerator.writeStringField("first_name", sampledPerson.getFirstName());
        jsonGenerator.writeStringField("last_name", sampledPerson.getLastName());
        jsonGenerator.writeStringField("city", sampledPerson.getCity());
        jsonGenerator.writeStringField("street", sampledPerson.getStreet());
        jsonGenerator.writeStringField("building_number", String.valueOf(sampledPerson.getBuildingNumber()));
        jsonGenerator.writeStringField("barcode", sampledPerson.getBarcode());
        jsonGenerator.writeStringField("get_date", String.valueOf(sampledPerson.getGetDate()));
        jsonGenerator.writeStringField("take_date", String.valueOf(sampledPerson.getTakeDate()));
        jsonGenerator.writeStringField("result_date", String.valueOf(sampledPerson.getResultDate()));
        jsonGenerator.writeEndObject();
    }
}
