class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        for i,num in enumerate(nums):
            #num > 0 means its impossible to create a triple == 0
            if(num > 0):
                break
            #check for duplicate values
            if(i > 0 and num == nums[i - 1]):
                continue
            l,r = i + 1, len(nums) - 1
            while(l<r):
                sumN = num + nums[l] + nums[r]
                if(sumN > 0):
                    r-= 1
                elif(sumN < 0):
                    l+= 1
                else:
                    ans.append([num,nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while(l < r and nums[l] == nums[l - 1]):
                        l+=1
        return ans
        