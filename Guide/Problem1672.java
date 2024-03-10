/**
 * Richest Customer Wealth : 
 * give a m x n integer grid account where acc[i][j] 
 * is the amount of money of customer Ith  has in the Jth bank
 * 
 * Customer Wealth = all money they have in all bank
 * Find the richest
 */

// Constraint : m==acc.length
//              n==acc[i].length
//              1 <= m, n <= 50
//              1 <= acc[i][j] <= 100

// In : acc = [ [7, 1, 3],
//              [2, 8, 7], 
//              [1, 9, 5]]
// Out : 17

public class Problem1672 {
    static int[][] accounts = new int[99][99];

    public static int richestCustomer(){
        int[] moneys = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int customer_money = 0;
            for (int j = 0; j < accounts.length; j++) {
               customer_money += accounts[i][j];
            }
            moneys[i] = customer_money;
        }

        int richest = moneys[0];
        for (int money : moneys) {
            if (money > richest) {
                richest = money;
            }
        }
        return richest;
    }
    
    public static void main(String[] args) {
        accounts = new int[][]{{7, 1, 3}, {2, 8, 7}, {2, 9, 5}};
        System.out.println(richestCustomer());
    }
}
