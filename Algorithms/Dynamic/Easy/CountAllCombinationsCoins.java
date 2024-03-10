package Algorithms.Dynamic.Easy;

import java.util.Scanner;

public class CountAllCombinationsCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        int n = input.nextInt();
        input.nextLine();
        int[] coins = new int[n];
        for (int i = 0; i < n;i++){
            coins[i] = input.nextInt();
        }
        System.out.println(count(coins,n,sum));
    }

    public static int count(int[] coins,int n,int sum){
        if (sum == 0){
            return 1;
        }
        if (sum < 0){
            return 0;
        }
        if (n <= 0){
            return 0;
        }
        return count(coins,n-1,sum) + count(coins,n,sum-coins[n-1]);
    }

}
