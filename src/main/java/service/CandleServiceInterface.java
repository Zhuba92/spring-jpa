package service;

import entity.Candle;

import java.util.List;

public interface CandleServiceInterface {
    Candle getCandle(int candleId);
    void updateCandle(Candle candle);
    List<Candle> getCandleList();
}
