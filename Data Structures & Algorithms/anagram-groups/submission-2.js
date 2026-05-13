class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const map = new Map();
        strs.forEach((str) =>{
            const sorted_str = str.split('').sort().join('');
            if(map.has(sorted_str)){
                map.get(sorted_str).push(str);
            }else{
                map.set(sorted_str,[str]);
            }
        })
        const ans = []
        map.forEach((val) =>{
            ans.push(val);
        })
        return ans;
    }
}
