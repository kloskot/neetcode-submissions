class Solution {
    public boolean isPalindrome(String s) {
        char[] input = s.toCharArray();
        int left = 0;
        int right = input.length - 1;
        while(left < right){
            char left_char = input[left];
            char right_char = input[right];
            if(!Character.isLetterOrDigit(left_char)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(right_char)){
                right--;
                continue;
            }
            else{
                if(Character.toUpperCase(left_char) != Character.toUpperCase(right_char)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
