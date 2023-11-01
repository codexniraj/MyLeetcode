/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
      HashMap<Integer,Integer> map = new HashMap<>();
		Traverse(root,map);
		Integer Max = 0;
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			Max = Math.max(Max,entry.getValue());
		}

		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry:map.entrySet()){
			if(Max==entry.getValue()) list.add(entry.getKey());
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public void Traverse(TreeNode root,HashMap<Integer,Integer> map){
		if(root==null) return;
		map.put(root.val,map.getOrDefault(root.val,0)+1);
		Traverse(root.left,map);
		Traverse(root.right,map);  
    }
}