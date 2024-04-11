class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        hashset = set(nums)
        maxCount = 1
        for n in hashset:
            if n - 1 not in hashset:
                nextN = n + 1
                count = 1
                while nextN in hashset:
                    count += 1
                    nextN += 1
                maxCount = max(maxCount, count)
        return maxCount
