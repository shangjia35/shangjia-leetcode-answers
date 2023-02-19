/* LeetCode 1 Two Sum */
/* Hash Map */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            
            int subNum = target - nums[i];
            // look up subNum in map
            if (map.containsKey(subNum)) {
                // if yes, then return
                ans[0] = map.get(subNum);
                ans[1] = i;
                return ans;
            } else {
                // if no, add num[i] to map
                map.put(nums[i], i);
            }
        }

        return ans;

    }
}
