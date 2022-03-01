package service;

import entity.Candle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.CandleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CandleService implements CandleServiceInterface {
    private CandleRepository candleRepository;

    @Autowired
    public CandleService(CandleRepository cr){this.candleRepository = cr;}

    @Override
    public Candle getCandle(int candleId) {
        Candle ca;
        Optional<Candle> c = candleRepository.findById(candleId);
        if(c.isPresent()){
            return c.get();
        }else{
            ca = new Candle();
            ca.setId(candleId);
        }
        return ca;
    }

    @Override
    public void updateCandle(Candle candle) {
        candleRepository.save(candle);
    }

    @Override
    public List<Candle> getCandleList() {
        List<Candle> list = new ArrayList<>();
        candleRepository.findAll().forEach(list::add);
        return list;
    }
}
