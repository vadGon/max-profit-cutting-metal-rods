import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int maxProfit(int costPerCut, int price, int[] lengths) {
        Arrays.sort(lengths);
        int maxLen = lengths[lengths.length - 1];
        int maxProfit = 0;

        int[] dp = new int[maxLen];

        for (int lenIndex = 0; lenIndex < lengths.length; lenIndex++) {
            for (int l = 1; l < lengths[lenIndex]; l++) {

                dp[l] = dp[l] + (lengths[lenIndex] / l * price * l) - ((lengths[lenIndex] / l - (lengths[lenIndex] % l == 0 ? -1 : 0)) * costPerCut);

                if (dp[l] > maxProfit) {
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
        for (int i = 0; i < n; i++) {
            lengths[i] = in.nextInt();
        }
        System.out.println(maxProfit(costPerCut, price, lengths));
    }
}
