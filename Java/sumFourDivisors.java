class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalDivisorsSum = 0;
        for (int n : nums) {
            int sumDivisors = 0;
            int countDivisors = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;
                    if (d1 == d2) {
                        countDivisors++;
                        sumDivisors += d1;
                    } else {
                        countDivisors += 2;
                        sumDivisors += d1 + d2;
                    }
                }
                if (countDivisors > 4) {
                    break;
                }
            }
            if (countDivisors == 4) {
                totalDivisorsSum += sumDivisors;
            }
        }
        return totalDivisorsSum;
    }
}