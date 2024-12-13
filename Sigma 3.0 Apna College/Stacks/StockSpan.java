import java.util.*;
public class StockSpan {
    /**
     * Given a stack of stock prices, this function calculates the span of the
     * given price. The span of a price is the number of days for which the
     * price of the stock remains smaller than or equal to the current price.
     * @param stockPrice a Stack of integers representing the sequence of
     * stock prices
     * @param price the price for which the span is to be calculated
     * @return the span of the given price
     */
    public static int stockSpan(Stack<Integer> stockPrice, int price){
        int currPrice = 0;
        int span = 1;
        while(currPrice != price){
            currPrice = stockPrice.pop();
        }
        int targetPrice = currPrice;
        currPrice = stockPrice.pop();
        while(currPrice < targetPrice){
            span++;
            currPrice = stockPrice.pop();
        }
        return span;
    }
    public static void main(String[] args) {
        Stack<Integer> stockPrice = new Stack<>();
        stockPrice.push(100);
        stockPrice.push(80);
        stockPrice.push(60);
        stockPrice.push(70);
        stockPrice.push(60);
        stockPrice.push(85);
        stockPrice.push(100);
        System.out.println(stockSpan(stockPrice, 80));
    }
}
