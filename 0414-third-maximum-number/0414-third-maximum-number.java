class Solution {
    public int thirdMax(int[] nums) {
    if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[1];
        
        long fMax=Long.MIN_VALUE, sMax=Long.MIN_VALUE, tMax=Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++) if(fMax<nums[i]) fMax = nums[i];
        for(int i=0;i<nums.length;i++) if(nums[i]<fMax && sMax<nums[i]) sMax = nums[i];
        for(int i=0;i<nums.length;i++) if(nums[i]<sMax && tMax<nums[i]) tMax = nums[i];  
        
        return (int)( tMax!=Long.MIN_VALUE ? tMax : fMax);    
    }
}