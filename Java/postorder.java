/**
 * Definition for a binary tree node. public class TreeNode { int data; TreeNode left; TreeNode
 * right; TreeNode(int val) { data = val; left = null, right = null } }
 */
class Solution {
  void postorderHelper(TreeNode root, List<Integer> result) {
    if (root == null) return;
    postorderHelper(root.left, result);
    postorderHelper(root.right, result);
    result.add(root.data);
  }

  public List<Integer> postorder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    postorderHelper(root, result);
    return result;
  }
}
