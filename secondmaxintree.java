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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> hm=new HashSet<>();
       travel(root,hm);
        if(hm.size()<2)
        return -1;
        int[] ans = new int[hm.size()];
        int index = 0;
        for (int num : hm) {
            ans[index++] = num;
        }     
        Arrays.sort(ans);
        return ans[1];    
    }   
    public static void travel(TreeNode root,  HashSet<Integer> hm)
    {
      List<Integer> ar=new ArrayList<>();
      if(root==null)
      return;
      hm.add(root.val);
     if(root.left!=null) travel(root.left,hm);
     if(root.right!=null) travel(root.right,hm);  
    }
}
