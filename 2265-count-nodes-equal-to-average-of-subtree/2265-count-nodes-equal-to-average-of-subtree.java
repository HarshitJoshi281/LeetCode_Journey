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
    private int result = 0;

    public int averageOfSubtree(TreeNode root) {
        result = 0; 
        calculateSubtree(root);
        return result;
    }

   
    private int[] calculateSubtree(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        
        int[] leftData = calculateSubtree(root.left);
        int[] rightData = calculateSubtree(root.right);

        
        int currentSum = root.val + leftData[0] + rightData[0];
        int currentCount = 1 + leftData[1] + rightData[1];

        if (root.val == currentSum / currentCount) {
            result++;
        }

        return new int[]{currentSum, currentCount};
    }
}
