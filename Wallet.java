public class Wallet {

    private int fazCoin;
    private double USDollars;

    public Wallet(){
        fazCoin = 500;
        USDollars = 5;
    }

    public Wallet(int fazCoin, double USDollars) {
        this.fazCoin = fazCoin;
        fazCoin = 500;
        this.USDollars = USDollars;
        USDollars = 5;
    }
    public int getFazCoin() {
        return fazCoin;
    }
    
    public void setFazCoin(int fazCoin) {
       this.fazCoin = fazCoin; 
    }
    public double getUSDollars() {
        return USDollars;

    }

    public void setUSDollars (double USDollars) {
        this.USDollars = USDollars;
    }
    
}
