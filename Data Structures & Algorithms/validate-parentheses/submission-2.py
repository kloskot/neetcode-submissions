class Solution:
    def isValid(self, s: str) -> bool:
        par_map = {'}':'{',
                    ']':'[',
                    ')':'('}
        stack = deque()
        for char in s:
            if char in par_map.values():
                stack.append(char)
            else:
                if not stack or stack[-1] != par_map[char]:
                    return False
                stack.pop()
            
        return not stack

