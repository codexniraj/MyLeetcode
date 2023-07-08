class Solution {
    public int numSquares(int n) {
        if(n == 1){
            return 1;
        }
        int i = 1;
        int closer = 1;
        int count = Integer.MAX_VALUE;
        while(i*i <= n){
            closer = i*i;
            if(n%closer == 0){ // if directly divible
                count = Math.min( n/closer, count);
                i++;
            }
            else{ //breaking n into square and remaining part
                int temp = n/closer;
                int num = n % closer;
                temp += numSquares(num); //again calling on remaining part
                closer = 1;
                count = Math.min(count, temp);
                i++;
            }
        }
        return count;
    }
}