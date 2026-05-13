class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> parentheses_map = new HashMap<>();
        parentheses_map.put('{','}');
        parentheses_map.put('[',']');
        parentheses_map.put('(',')');

        Stack<Character> ans_stack = new Stack<>();
        char[] input = s.toCharArray();
        
        for(char curr : input){
            if(parentheses_map.containsKey(curr)){
                ans_stack.push(parentheses_map.get(curr));
            }else{
                if(ans_stack.isEmpty() || curr != ans_stack.pop()){
                    return false;
                }
            }
        }
        if(ans_stack.isEmpty()){
            return true;
        }
        return false;
    }
}
