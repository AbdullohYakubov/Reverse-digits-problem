// Problem Statement: Given a non-negative integer u as input, reverse the digits of
// u and return the result. For example, if u = 123, the output should be 321.

import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scr.nextInt();
        int rev = 0;

        while(num != 0){
            if(num % 10 != 0){
                rev = rev * 10 + num % 10;
            }else{
                rev = rev + num % 10;
            }

            num = num / 10;
        }

        System.out.println("The reversed number is: " + rev);
        scr.close();
    }    
}