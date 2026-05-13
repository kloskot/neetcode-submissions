class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row_map = defaultdict(set)
        col_map = defaultdict(set)
        box_map = defaultdict(set)
        for row in range(9):
            for col in range(9):
                val = board[row][col]
                if val == '.':
                    continue
                if val in row_map[row] or val in col_map[col] or val in box_map[(row//3, col//3)]:
                    return False
                else:
                    row_map[row].add(val)
                    col_map[col].add(val)
                    box_map[(row//3, col//3)].add(val)
        
        return True

        