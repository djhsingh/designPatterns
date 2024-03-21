package djh.learn.dP.strategyDesignPattern.model;

import djh.learn.dP.strategyDesignPattern.ScoreAlgorithmBase;

public class SquareBallon extends ScoreAlgorithmBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) -40 ;
    }
}
