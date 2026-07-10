class Solution {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> path = new ArrayList<>();
        dfs(root, path);
        return sum;
    }

    private void dfs(TreeNode node, ArrayList<Integer> path) {
        if (node == null)
            return;

        
        path.add(node.val);

        // Leaf node
        if (node.left == null && node.right == null) {
            int num = 0;

            for (int digit : path) {
                num = num * 10 + digit;
            }

            sum += num;
        }

        dfs(node.left, path);
        dfs(node.right, path);

        path.remove(path.size() - 1);
    }
}