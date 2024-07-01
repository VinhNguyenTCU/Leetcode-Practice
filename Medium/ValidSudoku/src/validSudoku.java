import java.util.HashSet;

/*
 * Approach 1: Create a Hash set for each row, column, and box
 */
public class validSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        HashSet<Character>[] box = new HashSet[n];
        HashSet<Character>[] column = new HashSet[n];
        HashSet<Character>[] row = new HashSet[n];

        for (int i = 0; i < n; i++){
            box[i] = new HashSet<Character>();
            row[i] = new HashSet<Character>();
            column[i] = new HashSet<Character>();
        }

        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++){
                char value = board[r][c];
                
                if (value == '.'){
                    continue;
                }

                if (row[r].contains(value)){
                    return false;
                }else{
                    row[r].add(value);
                }

                if (column[c].contains(value)){
                    return false;
                }else{
                    column[c].add(value);
                }

                if (box[r/3 * 3 + c/3].contains(value)){
                    return false;
                }else{
                    box[r/3 * 3 + c/3].add(value);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
         {'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }
}
