class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == 1) {
            int[] count = new int[51];

            for (int num : nums) {
                count[num]++;
            }

            int ans = -1;

            for (int i = 0; i <= 50; i++) {
                if (count[i] == 1) {
                    ans = i;
                }
            }

            return ans;
        }

        if (k == n) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        int ans = -1;

        if (isUnique(nums, 0)) {
            ans = Math.max(ans, nums[0]);
        }

        if (isUnique(nums, n - 1)) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }

    private boolean isUnique(int[] nums, int index) {
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] == nums[index]) {
                return false;
            }
        }

        return true;
    }
}