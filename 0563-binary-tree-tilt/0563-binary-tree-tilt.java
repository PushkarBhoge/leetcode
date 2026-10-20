class Solution {
    int totalTilt = 0;

    public int findTilt(TreeNode root) {
        findSum(root);
        return totalTilt;
    }

    int findSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findSum(root.left);
        int right = findSum(root.right);

        totalTilt += Math.abs(left - right);

        return left + right + root.val;
    }
}