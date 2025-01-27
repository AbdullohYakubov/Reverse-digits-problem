// Problem Statement: You are given an array prices where prices[i] is the price of a
// given stock on the i-th day. You want to maximize your profit by choosing a single day
// to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve
// any profit, return 0.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        System.out.println("The maximum profit you can make by buying and selling the product throughout these consecutive days is: " + returnMaxProfit());
    }

    public static int returnMaxProfit(){
        Scanner scr = new Scanner(System.in);
        System.out.println("For how many days do you want to enter prices?");
        int numOfDays = scr.nextInt();

        System.out.println("Please enter the prices for " + numOfDays + " days:");

        int[] prices = new int[numOfDays];
        int minVal = Integer.MAX_VALUE;
        int maxProfit = 0;
        int tempProfit = 0;

        if(numOfDays <= 1){
            scr.close();
            System.out.println("Invalid number of days! You need at least 2 days to buy and sell the product.");
            return 0;
        }
        
        for(int i = 0; i < prices.length; i++){
            prices[i] = scr.nextInt();

            if(prices[i] < minVal){
                minVal = prices[i];
            }

            tempProfit = prices[i] - minVal;
            if(tempProfit > maxProfit){
                maxProfit = tempProfit;
            }
        }

        scr.close();
        return maxProfit;
    }
}
