/*leetcode = 1672. Richest Customer Wealth

In this we have to find the richest customer from given matrix of array 2d, rows will be customer and col will be bank accounnts.
what we have done here-->
- we have assigned outer loop with result- as it will store the result of first row
- temp will store the value of whole row */

class Solution{
    public int maximumWealth(int[][] accounts){
        int result = 0;
        for(int i = 0; i < accounts.length; i++){
            int temp = 0;
            for(int j = 0; j < accounts[i].length; ){
                temp += account[i][j];
            }
            result = Math.max(result, temp);
        }
        return result;
    }
}
