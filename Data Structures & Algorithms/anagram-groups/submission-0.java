class Solution {

    public String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            String code = sortString(word);
            if(map.containsKey(code)){
                List<String> curr_list = map.get(code);
                curr_list.add(word);
                map.put(code,curr_list);
            }else{
                List<String> init_list = new ArrayList<>();
                init_list.add(word);
                map.put(code,init_list);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> value : map.values()){
            ans.add(value);
        }
        return ans;
    }
}
