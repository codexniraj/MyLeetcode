class Solution {
    public List<String> summaryRanges(int[] nums) {
    List<String> ans=new ArrayList<>();
        if(nums==null || nums.length==0) return ans;
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            
            while(i<nums.length-1 && nums[i]+1==nums[i+1]) i++;
            
            if(num!=nums[i]) ans.add(num+"->"+nums[i]);
            else ans.add(num+"");
        }
        return ans;    
    }
}