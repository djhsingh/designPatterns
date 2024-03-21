package djh.learn.dP.strategyDesignPattern;

public class ScoreBoard {
    public ScoreAlgorithmBase sb;

    void showScore(int taps,int multipliers){
        System.out.println(sb.calculateScore(taps,multipliers));
    }
}
