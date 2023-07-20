class Solution {
public List getRow(int rowIndex) {

    List<List<Integer>> triangle = new ArrayList<>();
    
    for(int i=0; i<=rowIndex; i++){
        List<Integer> list = new ArrayList<>();
        for(int j=0; j<i+1; j++){
            
            if(j==0 || j==i){
                list.add(1);
            }
            else{
                list.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            
        }
        triangle.add(list);
    }
    return triangle.get(rowIndex);
}
}