class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007;
        long same = 6;
        long diff = 6;
        for (int i = 2; i <= n; i++) {
            long newSame = (same * 3 + diff * 2) % 1000000007;
            long newDiff = (same * 2 + diff * 2) % 1000000007;
            same = newSame;
            diff = newDiff;
        }
        return (int) ((same + diff) % mod);
    }
}