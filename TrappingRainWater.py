class Solution:
    def trap(self, height: List[int]) -> int:
        # Time O(n) Space O(n)
        # maxLeft = [0] * len(height)
        # maxRight = [0] * len(height)
        # res = 0

        # maxLeft[0] = height[0]
        # maxRight[len(height) - 1] = height[len(height) - 1]

        # for i in range(1, len(height)):
        #     maxLeft[i] = max(maxLeft[i - 1], height[i])

        # for i in range(len(height) - 2, -1, -1):
        #     maxRight[i] = max(maxRight[i + 1], height[i])

        # for i in range(1, len(height) - 1):
        #     water = min(maxLeft[i - 1], maxRight[i + 1]) - height[i]
        #     if water > 0:
        #         res += water

        # return res

        # O(1) space
        l = 1
        r = len(height) - 2
        maxLeft = height[0]
        maxRight = height[len(height) - 1]
        ans = 0

        while l <= r:
            if maxLeft <= maxRight:
                water = maxLeft - height[l]
                if water > 0:
                    ans += water
                
                l += 1
                maxLeft = max(maxLeft, height[l - 1])
            else:
                water = maxRight - height[r]
                if water > 0:
                    ans += water
                
                r -= 1
                maxRight = max(maxRight, height[r + 1])
        return ans
