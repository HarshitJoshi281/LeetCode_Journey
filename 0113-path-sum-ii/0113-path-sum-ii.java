class Solution {
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        help(result, root, targetSum, 0);
        return result;
    }

    public void help(List<List<Integer>> result, TreeNode root, int targetSum, int sum) {

        if (root == null) return;

        temp.add(root.val);
        sum += root.val;

        if (root.left == null && root.right == null && sum == targetSum) {
            result.add(new ArrayList<>(temp));
        }

        help(result, root.left, targetSum, sum);
        help(result, root.right, targetSum, sum);

        temp.remove(temp.size() - 1);
    }
}