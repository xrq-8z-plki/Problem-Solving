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
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currentLevel = 1;

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            int totalLevelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                totalLevelSum += node.val;

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            if (totalLevelSum > maxSum) {
                maxSum = totalLevelSum;
                maxLevel = currentLevel;
            }
            currentLevel++;
        }
        return maxLevel;
    }
}