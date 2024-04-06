class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # O(n)

        ans = []
        # count the frequency of each unique element
        count = {}
        for n in nums:
            if n in count:
                count[n] += 1
            else:
                count[n] = 1

        # gather elements with the same frequency in the same 'bucket' 
        freq = [[] for _ in range(len(nums) + 1)] # index -> frequency; value -> elements of this frequency
        for num in count:
            f = count[num]
            freq[f].append(num)
        
        for i in range(len(freq) - 1, 0, -1):
            for e in freq[i]:
                ans.append(e)
                if len(ans) == k:
                    return ans
        
