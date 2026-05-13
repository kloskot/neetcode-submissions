class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0

        if len(s) == 1:
            return 1

        longest  = 0
        left_p = 0
        count = 0
        seen_set = set()

        for i, char in enumerate(s):
            if not(char in seen_set):
                seen_set.add(char)
                count += 1
            else:
                longest = max(count, longest)
                while(s[left_p] != char):
                    seen_set.remove(s[left_p])
                    left_p += 1
                    count -= 1
                left_p += 1

        longest = max(count,longest)

        return longest