class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sort_list = {}
        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in sort_list.keys():
                sort_list[sorted_word].append(word)
            else:
                sort_list[sorted_word] = [word]
        return sort_list.values()

        