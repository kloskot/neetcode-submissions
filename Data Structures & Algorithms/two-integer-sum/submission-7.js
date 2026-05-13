class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const parsed = new Map();
        parsed.set(nums[0],0);
        for(let i = 1; i < nums.length; i++){
            if(parsed.has(target - nums[i])){
                return [parsed.get(target-nums[i]),i];
            }else{
                parsed.set(nums[i],i);
            }
        }
    }
}
