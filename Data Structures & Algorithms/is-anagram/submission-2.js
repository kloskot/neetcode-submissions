class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length){
            return false;
        }
        const hashMap_s = new Map();
        const hashMap_t = new Map();
        for(let i = 0; i < s.length; i++){
            if(hashMap_s.has(s[i])){
                hashMap_s.set(s[i],hashMap_s.get(s[i]) + 1);
            }else{
                hashMap_s.set(s[i],1);
            }
            if(hashMap_t.has(t[i])){
                hashMap_t.set(t[i],hashMap_t.get(t[i]) + 1);
            }else{
                hashMap_t.set(t[i],1);
            }
        }
        for(let [key,value] of hashMap_s){
            if(!hashMap_t.has(key) || hashMap_t.get(key) != value){
                return false;
            }
        }
        return true;

    }
}
