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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1,map);
    }

    private TreeNode build(int[] preorder, int pLow, int pHigh, int[] inorder, int iLow, int iHigh,
                             HashMap<Integer,Integer> map){
        if(pLow > pHigh || iLow > iHigh){
            return null;
        }

        TreeNode root = new TreeNode(preorder[pLow]);
        int index = map.get(preorder[pLow]);
        int leftOutSize = index-iLow;
        
        root.left = build(preorder,pLow+1,pLow+leftOutSize,inorder,iLow,index-1,map);
        root.right = build(preorder,pLow+leftOutSize+1,pHigh,inorder,index+1,iHigh, map);
        return root;
    }
}