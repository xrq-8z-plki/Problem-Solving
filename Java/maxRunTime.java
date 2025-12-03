class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long totalEnergy = 0;
        for (int i = 0; i < batteries.length; i++) {
            totalEnergy += batteries[i];
        }
        Arrays.sort(batteries);
        for (int i = batteries.length - 1; i >= 0; i--) {
            long avg = totalEnergy / n;
            if (batteries[i] > avg) {
                totalEnergy -= batteries[i];
                n--;
            } else {
                break;
            }
        }
        return totalEnergy / n;
    }
}