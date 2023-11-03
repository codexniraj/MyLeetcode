class Solution {
    public List<String> buildArray(int[] target, int n) {
       List<String> arr = new ArrayList<>();        
        for(int i=1,k=0;i<=n&& k<target.length;++i){
            arr.add("Push");
            if(target[k]!= i)    arr.add("Pop");
            else     ++k;           
        }
        return arr;   
    }
}