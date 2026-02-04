class Solution {
    public int countNodes(TreeNode root) {
        return count(root);  
    }
    
   static int count(TreeNode root)
   {
    if (root == null){
        return 0;}
    int leftCount = count(root.left);
    int rightCount = count(root.right);
    return 1 + leftCount + rightCount;
    }

}