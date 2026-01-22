class Solution {
    boolean isSorted(List<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public int minimumPairRemoval(int[] nums) {
        List<Integer> arr = new ArrayList<>();//Array->List
        for (int x : nums) {
            arr.add(x);
        }
        int operations = 0;
        while (!isSorted(arr)) {
            int minSum = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }
            arr.remove(index + 1);
            arr.set(index, minSum);

            operations++;
        }
        return operations;
    }
}