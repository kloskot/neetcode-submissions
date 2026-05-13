class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const ansSet = new Set();
        for(let i = 0; i < nums.length; i++){
            if(ansSet.has(nums[i])){
                return true;
            }else{
                ansSet.add(nums[i]);
            }
        }
        return false;
    }
}
