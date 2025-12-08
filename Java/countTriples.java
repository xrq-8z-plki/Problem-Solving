class Solution {
    public int countTriples(int n) {
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sideSum = (i * i) + (j * j);
                int hyp = (int) Math.sqrt(sideSum);//Math.sqrt() always returns a double, not an int.
                if (hyp <= n) {
                    if (hyp * hyp == sideSum) {
                        ans += 2;
                    }
                }
                else {
                    break;
                }
            }
        }
        return ans;
    }
}