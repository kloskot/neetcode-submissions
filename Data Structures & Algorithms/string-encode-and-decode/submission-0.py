class Solution:

    def encode(self, strs: List[str]) -> str:
        ans = ""
        for word in strs:
            edit_word = "|" + word
            ans = ans + edit_word
        return ans

    def decode(self, s: str) -> List[str]:
        ans = s.split("|")
        return ans[1:]
