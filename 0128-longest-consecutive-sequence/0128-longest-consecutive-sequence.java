class Solution {
    public int longestConsecutive(int[] nums) {
             if(nums.length < 2) return nums.length;
        
        
        int result = 1, temp = 1;
        Arrays.sort(nums);

        
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i]==nums[i-1]) continue;
            
            else if(nums[i]-1 != nums[i-1]) temp = 1;
            
            else{
                temp++;
                if(temp>result) result = temp;
            }
            
        }
        return result;   
    }
}