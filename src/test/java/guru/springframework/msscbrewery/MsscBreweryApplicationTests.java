package guru.springframework.msscbrewery;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbrewery.web.model.BeerDto;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MsscBreweryApplicationTests {
	@Autowired
	ObjectMapper objectMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void beerDto() throws JsonProcessingException {
		BeerDto beerDto = BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
		String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(beerDto);
		System.out.println(json);
	}
}
