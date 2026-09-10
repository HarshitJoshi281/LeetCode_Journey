class Solution {
    int result;
    int count;

    public int averageOfSubtree(TreeNode root) {
        return solve(root);
    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }

        count = 0;
        int sum = findSum(root);

        if (root.val == sum / count) {
            result++;
        }

        solve(root.left);
        solve(root.right);

        return result;
    }

    public int findSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        count++;

        int lSum = findSum(root.left);
        int rSum = findSum(root.right);

        return root.val + lSum + rSum;
    }
}