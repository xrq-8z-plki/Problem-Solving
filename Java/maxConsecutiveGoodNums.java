class Solution {
  public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
    Set<Integer> goodSet = new HashSet<>();
    for (int i = 0; i < goodNumbers.length; i++) {
      goodSet.add(goodNumbers[i]);
    }
    int maxLen = 0;
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      if (goodSet.contains(nums[i])) {
        current++;
        maxLen = Math.max(maxLen, current);
      } else {
        current = 0;
      }
    }
    return maxLen;
  }
}
