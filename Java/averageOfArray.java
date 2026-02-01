class Solution {
  public double averageOfArray(int[] nums) {
    // Your code goes here
    int total = 0;

    for (int i = 0; i < nums.length; i++) {
      total += nums[i];
    }
    return (double) total / nums.length;
  }
}
