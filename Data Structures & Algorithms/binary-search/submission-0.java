class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1 ;
        while(low <= high){
            int midpoint = (high + low) / 2;
            if(target > nums[midpoint]){
                low = midpoint + 1;
                continue;
            }
            if(target < nums[midpoint]){
                high = midpoint - 1;
                continue;
            }
            if(target == nums[midpoint]){
                return midpoint;
            }
        }
        return -1;

    }
}
