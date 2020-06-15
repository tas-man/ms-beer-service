package tas.springframework.msbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tas.springframework.msbeerservice.domain.Beer;
import tas.springframework.msbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Old Brew")
                    .beerStyle("Ale")
                    .quantityToBrew(200)
                    .minOnHand(20)
                    .price(new BigDecimal("4.95"))
                    .upc(888880000001L)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Moon Brew")
                    .beerStyle("IPA")
                    .quantityToBrew(400)
                    .minOnHand(20)
                    .price(new BigDecimal("3.95"))
                    .upc(888880000002L)
                    .build());
        }
    }
}
