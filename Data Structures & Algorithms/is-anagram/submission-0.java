class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCounter = new int[26];
        int[] tCounter = new int[26];
        for(int i = 0; i < s.length(); i++){
            int letterPositionInCountArray = s.charAt(i) - 'a'; // i.e for a - 0, b - 1 etc
            sCounter[letterPositionInCountArray]++; // increment that position 
        }
        for(int j = 0; j < t.length(); j++){
            int letterPositionInCountArray = t.charAt(j) - 'a'; // i.e for a - 0, b - 1 etc
            tCounter[letterPositionInCountArray]++; // increment that position 
        }
        return Arrays.equals(sCounter, tCounter);
    }
}
