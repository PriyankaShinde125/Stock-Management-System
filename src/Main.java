import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Main {
    StockAccount stockAccount;

    public static void main(String[] args) {
        Main main = new Main();
        int noOfStocks = 0;
        main.stockAccount = new StockAccount();
        JSONParser parser = new JSONParser();
        try {
            JSONArray stockList = (JSONArray) parser.parse(new FileReader("src/StockList.json"));
            noOfStocks = stockList.size();
            for (Object stock : stockList) {
                JSONObject stockDetails = (JSONObject) stock;
                Stock stockPojoObj = new Stock((String) stockDetails.get("shareName"), Integer.parseInt((String) stockDetails.get("numberOfShares")), Double.parseDouble((String) stockDetails.get("sharePrice")));
                stockPojoObj.setTotalPrice();
                main.stockAccount.getStockList().add(stockPojoObj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        main.stockAccount.setTotalStockPrice();
        System.out.println("Total number of stocks : " + noOfStocks);
        main.stockAccount.printStockReport();
    }
}