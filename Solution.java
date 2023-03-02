import java.io.*;
import java.util.*;

public class Solution {

//In order to maximize profit, he should sell the metal of same size and shape. If he sells  metal rods of length , he receives N x L x metal_price. 
//The remaining smaller metal rods will be thrown away. To cut the metal rods, he needs to pay cost_per_cut for every cut.
//
//What is the maximum amount of money Mr. Octopus can make?
//
//Input Format
//First line of input contains costPerCut
//Second line of input contains metalPrice
//Third line contains L, the number of rods Mr. Octopus has, followed by L integers in each line representing length of each rod.
//
//Output Format
//Print the result corresponding to the testcase.

//Constraints
//1 <= metal_price, cost_per_cut <= 1000
//1 <= L <= 50
//Each element of lenghts will lie in range [1, 10000].

    static int maxProfit( int costPerCut, int price, int[] lengths){
        Arrays.sort(lengths);
        int maxLen = lengths[lengths.length-1];
        int maxProfit = 0;

        int[] dp = new int[maxLen];
        
        for(int lenIndex=0; lenIndex<lengths.length; lenIndex++){
            for(int l=1; l<lengths[lenIndex]; l++){
  
                dp[l] = dp[l] + (lengths[lenIndex]/l*price*l) - ((lengths[lenIndex]/l-(lengths[lenIndex]%l==0? -1 : 0))*costPerCut);
                
                if(dp[l]>maxProfit){
                    maxProfit = dp[l];
                }
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
  
     Scanner in = new Scanner(System.in);   
     int costPerCut = in.nextInt();
     int price = in.nextInt();
     int n = in.nextInt();
     int[] lengths = new int[n];
          for(int i = 0; i<n; i++){
         lengths[i]=in.nextInt();
     }
     System.out.println(maxProfit(costPerCut, price, lengths));
    }
}
