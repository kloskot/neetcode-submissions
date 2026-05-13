class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        val_count = {}
        nums.sort()
        curr = nums[0]
        count = 0
        for val in nums:
            if val == curr:
                count = count + 1
            else:
                val_count[curr] = count
                curr = val
                count = 1
        val_count[curr] = count
        print(val_count)
        return sorted(val_count, key=val_count.get, reverse=True)[:k]
