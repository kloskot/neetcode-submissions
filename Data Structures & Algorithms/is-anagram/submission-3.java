class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> h = new Hashtable<>();
        
        for(int i = 0; i < s.length(); i++){
            char curr_char = s.charAt(i);
            if(h.containsKey(curr_char)){
                int curr = h.get(curr_char);
                h.put(curr_char,curr + 1);
            }else{
                h.put(curr_char,1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            char curr_char = t.charAt(i);
            if (h.containsKey(curr_char)){
                int curr = h.get(curr_char);
                h.put(curr_char, curr - 1);
            }else{
                return false;
            }
        }

        for(int i : h.values()){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}
