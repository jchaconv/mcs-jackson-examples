package expert.spriframework.mcsjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdateDate(OffsetDateTime.now())
                .lastUpdateDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(312312454534L)
                .build();
    }

}
