import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class game {

    public game() throws IOException {
        start_game();
    }
    public game(int size) throws IOException {

    }
    static int size;
    public void start_game() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Please enter width of bottom row:");
        size = 4; //Integer.parseInt(reader.readLine());
        boolean firstBoard = true;
        Board gameBoard = new Board(size, firstBoard);
        System.out.println("here");
        Bot bot = new Bot();
        List<int[]> moves = new ArrayList<int[]>();
        List<int[]> winningMoves = bot.recursion(gameBoard, moves);
        System.out.println(winningMoves);
        //Bot solver = new Bot(gameBoard);
    }






}
