import java.util.HashSet;

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

    }

    public static void main(String[] args) {
        char[][] board = {{'8','3','.','.','7','.','.','.','.'},
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
