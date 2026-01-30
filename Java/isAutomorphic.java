class Solution {
  public boolean isAutomorphic(int n) {
    // Your code goes here
    long res = (long) n * n;
    int temp = n;
    int pow = 1;
    while (temp > 0) {
      pow = pow * 10;
      temp = temp / 10;
    }
    return res % pow == n;
  }
}
