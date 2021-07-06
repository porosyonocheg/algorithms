package backtracking;

/** Поиск переданного слова word в таблице символов board. Слово может быть составлено из смежных символов по вертикали
 * и горизонтали, каждый из которых должен быть использован лишь единожды.
 * @author Сергей Шершавин*/

public class WordSearch {
    /**@return true если искомое слово существует в таблице, false -  противном случае*/
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (checkWord(board, word.toCharArray(), 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean checkWord(char[][] board, char[] letters, int indexOfLetter, int i, int j) {
        if (indexOfLetter == letters.length) return true;
        if (i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != letters[indexOfLetter]) return false;
        board[i][j] ^= 256; //меняем текущий символ на другой небуквенный, чтобы не было возможности использовать его повторно
        boolean result = checkWord(board, letters, indexOfLetter+1, i-1, j) || checkWord(board, letters, indexOfLetter+1, i+1, j) || checkWord(board, letters, indexOfLetter+1, i, j-1) || checkWord(board, letters, indexOfLetter+1, i, j+1);
        board[i][j] ^= 256; //восстанавливаем символ
        return result;
    }
}
