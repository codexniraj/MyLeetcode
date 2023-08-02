class Solution {
    public int maxProfit(int[] prices) {
        int aheadBuy0Cap1 = 0;
        int aheadBuy0Cap2 = 0; 
        int aheadBuy1Cap1 = 0;
        int aheadBuy1Cap2 = 0;

        int n = prices.length;
        for (int ind = n - 1; ind >= 0; ind--) {
            for (int cap = 2; cap >= 1; cap--) {
                if (cap == 2) {
                    int buy0Cap2 = Math.max(0 + aheadBuy0Cap2, -prices[ind] + aheadBuy1Cap2);
                    int buy1Cap2 = Math.max(0 + aheadBuy1Cap2, prices[ind] + aheadBuy0Cap1);
                    aheadBuy0Cap2 = buy0Cap2;
                    aheadBuy1Cap2 = buy1Cap2;
                }
                if (cap == 1) {
                    int buy0Cap1 = Math.max(0 + aheadBuy0Cap1, -prices[ind] + aheadBuy1Cap1);
                    int buy1Cap1 = Math.max(0 + aheadBuy1Cap1, prices[ind]);
                    aheadBuy0Cap1 = buy0Cap1;
                    aheadBuy1Cap1 = buy1Cap1;
                }
            }
        }

        return aheadBuy0Cap2;
        
    }
}