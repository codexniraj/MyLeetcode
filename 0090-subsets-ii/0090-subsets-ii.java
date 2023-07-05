class Solution {
    static void f(int i,int[] nums,List<Integer> arr, List<List<Integer>> ans){
   ans.add(new ArrayList<>(arr));
   for(int index=i;index<nums.length;index++){
       if(index!=i && nums[index]==nums[index-1]) continue;
       else{
           arr.add(nums[index]);
           f(index+1,nums,arr,ans);
           arr.remove(arr.size()-1);
        } 
    }
   }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,new ArrayList<>(0),ans);
        return ans;
    }
}