// Problem Statement: You are given an array prices where prices[i] is the price of a
// given stock on the i-th day. You want to maximize your profit by choosing a single day
// to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve
// any profit, return 0.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter the prices for the seven days:");

        int[] prices = new int[7];
        int maxVal = 0;
        int dayToSell = 0;
        int minVal = 1000000000;
        int dayToBuy = 0;
        
        for(int i = 0; i < prices.length; i++){
            prices[i] = scr.nextInt();

            if(prices[i] > maxVal){
                maxVal = prices[i];
                dayToSell = i;
            }

            if(prices[i] < minVal){
                minVal = prices[i];
                dayToBuy = i;
            }
        }
       
        System.out.println("The maximum profit is: " + returnProfit(maxVal, minVal, dayToBuy, dayToSell));
    }

    public static int returnProfit(int _maxVal, int _minVal, int _dayToBuy, int _dayToSell){
        if(_maxVal > _minVal && _dayToSell > _dayToBuy){
            return _maxVal - _minVal;
        }else{
            return 0;
        }
    }
}
