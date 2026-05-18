class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            boolean added = false;
            String curr_word = strs[i];
            for(int j = 0; j < ans.size(); j++){
                if(isAnagram(curr_word, ans.get(j).get(0))){
                    ans.get(j).add(curr_word);
                    added = true;
                    break;
                }
            }
            if(added == false){
                List<String> new_list = new ArrayList<>();
                new_list.add(curr_word);
                ans.add(new_list);
            }
        }

        return ans;
    }

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
