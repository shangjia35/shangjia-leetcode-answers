class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i <= nums.length - 3; i++) {
            while (i > 0 && i <= nums.length - 3 && nums[i] == nums[i - 1]) {
                i++;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> trip = new ArrayList<>();
                    trip.add(nums[i]);
                    trip.add(nums[l]);
                    trip.add(nums[r]);

                    ans.add(trip);

                    l++;
                    r--;

                    while (nums[l] == nums[l-1] && l < r) {
                        l++;
                    }

                    while (nums[r] == nums[r+1] && r > l) {
                        r--;
                    }

                    
                    
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                }
            }
            
            
        }


        return ans;
    }
}
