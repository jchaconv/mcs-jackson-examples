package expert.spriframework.mcsjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import expert.spriframework.mcsjacksonexamples.model.BaseTest;
import expert.spriframework.mcsjacksonexamples.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest {

    @Test
    void testKebabJson() throws JsonProcessingException {

        BeerDto dto = getDto();

        String jsonString = objectMapper.writeValueAsString(dto);

        System.out.println(jsonString);
    }
}
