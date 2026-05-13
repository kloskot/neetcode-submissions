class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max_w = 0
        l,r = 0, len(heights) - 1
        while(l<r):
            max_w = max(max_w,
                        (min(heights[l],heights[r]) * (r-l)))
            if(heights[l] < heights[r]):
                l += 1
            else:
                r -= 1

        return max_w