package expert.spriframework.mcsjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {

        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);

    }


    @Test
    void testDeserialize() throws JsonProcessingException {

        String json = "{\"beerId\":\"f4569b87-a2ed-486d-ae27-0a911fc191c1\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":312312454534,\"price\":12.99,\"createdDate\":\"2021-03-02T17:39:51.8-05:00\",\"lastUpdateDate\":\"2021-03-02T17:39:51.8-05:00\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);

    }
}