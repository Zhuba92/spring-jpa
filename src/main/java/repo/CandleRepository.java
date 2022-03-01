package repo;

import entity.Candle;
import org.springframework.data.repository.CrudRepository;

public interface CandleRepository extends CrudRepository<Candle, Integer> {
}
