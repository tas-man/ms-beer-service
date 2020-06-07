package tas.springframework.msbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import tas.springframework.msbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
