class Solution {
  public long maxSumScore(int[] nums) {
    long totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }
    long prefix = 0;
    long maxScore = Long.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      prefix += nums[i];
      long suffix = totalSum - prefix + nums[i];
      long current = Math.max(prefix, suffix);
      maxScore = Math.max(maxScore, current);
    }
    return maxScore;
  }
}
