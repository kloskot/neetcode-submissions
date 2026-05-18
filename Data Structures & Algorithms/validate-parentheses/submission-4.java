class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char curr_char = s.charAt(i);

            if(curr_char == '(' || curr_char == '[' || curr_char == '{'){
                stack.push(curr_char);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char comp_char = stack.pop();
                if(curr_char == ')' && comp_char != '('){
                    return false;
                }
                if(curr_char == ']' && comp_char != '['){
                    return false;
                }
                if(curr_char == '}' && comp_char != '{'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
