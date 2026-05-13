class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_substring = 0
        substring_set = set() #{char : indx}
        curr_pointer = 0
        for i,char in enumerate(s):
            while(char in substring_set):
                substring_set.remove(s[curr_pointer])
                curr_pointer += 1
            substring_set.add(char)
            max_substring = max(max_substring,i - curr_pointer + 1)
        return max_substring

