class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1

        while left < right:
            if s[left].casefold().isalnum() and s[right].casefold().isalnum():
                if s[left].casefold() != s[right].casefold():
                    return False
                else:
                    left = left + 1
                    right = right - 1
            else: 
                if not s[left].isalnum():
                    left = left + 1
                if not s[right].isalnum():
                    right = right - 1
        
        return True


        