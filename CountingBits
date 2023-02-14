/* LeetCode 338 Counting Bits */
/* DP */

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        
        if (n >= 1) {
            ans[1] = 1;
        }

        int offset = 1;

        for (int i = 2; i <= n; i++) {
            if (i == offset * 2) {
                offset *= 2;
            }

            ans[i] = 1 + ans[i - offset];
        }

        return ans;        
    }
}
