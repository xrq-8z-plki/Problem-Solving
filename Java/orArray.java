class Solution {
  public List<Integer> orArray(List<Integer> A) {
    // User code goes here
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < A.size() - 1; i++) {
      ans.add(A.get(i) | A.get(i + 1));
    }
    return ans;
  }
}
