import java.util.ArrayList;

public class StockAccount {
    ArrayList<Stock> stockList;
    double totalStockPrice;

    public StockAccount() {
        stockList = new ArrayList<>();
    }

    public StockAccount(ArrayList<Stock> stockList) {
        this.stockList = stockList;
    }

    public ArrayList<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(ArrayList<Stock> stockList) {
        this.stockList = stockList;
    }

    public double getTotalStockPrice() {
        return totalStockPrice;
    }

    public void setTotalStockPrice() {
        double totalStockPrice = 0;
        for (Stock stock : stockList) {
            totalStockPrice += stock.getTotalPrice();
        }
        this.totalStockPrice = totalStockPrice;
    }

    void printStockReport() {
        int i = 1;
        for (Stock stock : stockList) {
            System.out.println("Stock" + i + " \t" + stock);
            i++;
        }
        System.out.println("Total stock price = " + totalStockPrice);
    }
}
