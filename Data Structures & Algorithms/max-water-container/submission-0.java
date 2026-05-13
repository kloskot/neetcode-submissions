class Solution {
    public int calcArea(int side1, int side2, int distance){
        if(side1 < side2){
            return side1 * distance;
        }
        return side2 * distance;
    }

    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        while(left < right){
            int curr_area = calcArea(heights[left], heights[right], right - left);
            if(curr_area > max){
                max = curr_area;
            }
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
