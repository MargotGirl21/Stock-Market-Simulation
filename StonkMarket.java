import java.util.Random;

public class StonkMarket {

    private double exchangeRate = 1;
    private static final Random RANDY = new Random();

    public double fazCoinToUSD(int fazCoin){
        return (fazCoin * getExchangeRate()) / 100.0;
    }
public double getExchangeRate(){
    return exchangeRate;
}
public double changeExchangeRate(){
     this.exchangeRate += (RANDY.nextDouble() - 0.5);
     return exchangeRate;
}


}
