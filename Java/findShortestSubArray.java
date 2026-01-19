class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            count.put(num, count.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num)) {
                first.put(num, i);
            }
            last.put(num, i);
        }

        int degree = 0;
        for (int val : count.values()) {
            degree = Math.max(degree, val);
        }

        int ans = nums.length;
        for (int key : count.keySet()) {
            if (count.get(key) == degree) {
                ans = Math.min(ans, last.get(key) - first.get(key) + 1);
            }
        }

        return ans;
    }
}