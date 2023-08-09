class Solution {
    public int singleNumber(int[] nums) {
        int count=0;

        if(nums.length==1)
        {
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]!=nums[i+1])
                {
                    return nums[i];
                }
            }
            else if(i==nums.length-1)
            {
                if(nums[i]!=nums[nums.length-2])
                {
                    return nums[i];
                }
            }
            else{
                if((nums[i]!=nums[i+1]) && (nums[i]!=nums[i-1]))
                {
                    return nums[i];
                }
            }
        }
        
        return -1;
    }
}