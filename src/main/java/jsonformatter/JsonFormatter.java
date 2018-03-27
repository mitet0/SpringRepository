package jsonformatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by Mitet0 on 3/27/2018
 */
@Service
public class JsonFormatter {
    private final ObjectMapper mapper;

    @Autowired
    public JsonFormatter(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public void printObjectToJson(Object object) throws JsonProcessingException {
        String convertedObject = mapper.writeValueAsString(object);
        System.out.println(convertedObject);
    }
}
