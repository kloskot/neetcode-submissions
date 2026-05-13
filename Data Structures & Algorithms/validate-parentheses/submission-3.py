class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        bracketMap = {"]":"[","}":"{",")":"("}
        for curr in s:
            if curr in bracketMap.values():
                stack.append(curr)
            else:
                if not stack or stack[-1] != bracketMap[curr]:
                    return False
                else:
                    stack.pop()
        
        if not stack:
            return True
        
        return False