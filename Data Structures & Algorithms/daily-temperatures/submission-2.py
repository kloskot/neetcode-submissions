class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        stack = [] #[value,indx]
        for i,temp in enumerate(temperatures):
            while(stack and temp > stack[-1][0]):
                res_temp, res_indx = stack.pop()
                res[res_indx] = i - res_indx
            stack.append([temp,i])
        return res
