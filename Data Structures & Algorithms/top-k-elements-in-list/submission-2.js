class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        //create map number -> count
        //sort by count 
        const map = new Map();
        nums.forEach((num) => {
            if(map.has(num)){
                map.set(num,map.get(num) + 1);
            }else{
                map.set(num,1);
            }
        });
        const pre_ans = [...map.entries()].sort((a,b) => b[1] - a[1]);
        const ans = [];
        for(let i = 0; i < k; i++){
            ans.push(pre_ans[i][0]);
        }
        return ans;
    }
}
