class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for(int x : nums){
            if(!check.add(x)){
                return true;
            }
        }
        return false;
    }
}
