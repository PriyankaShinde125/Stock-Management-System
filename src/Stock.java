public class Stock {
    String shareName;
    int numberOfShares;
    double sharePrice;
    double totalPrice;

    public Stock(String shareName, int numberOfShares, double sharePrice) {
        this.shareName = shareName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = numberOfShares * sharePrice;
    }

    @Override
    public String toString() {
        return "Share name = " + shareName + "\tNumber of shares = " + numberOfShares + "\tShare price = " + sharePrice + "\tTotal price = " + totalPrice + "\n";
    }
}
