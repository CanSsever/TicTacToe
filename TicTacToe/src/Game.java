import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] arr = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        while (true) {
            PrintGameBoard(arr);
            System.out.println("Hamleni yap");
            int hamle = scan.nextInt();

            PlacePiece(arr, hamle, "player");
            Random rand = new Random();
            int cpuHamle = rand.nextInt(9) + 1;
            PlacePiece(arr, cpuHamle, "cpu");
            PrintGameBoard(arr);


        }

    }

    public static void PlacePiece(char[][] arr, int hamle, String user) {
        char symbol = 'X';
        if (user.equals("player")) symbol = 'X';
        else if (user.equals("cpu")) symbol = 'O';
        switch (hamle) {
            case 1:
                arr[0][0] = symbol;
                break;
            case 2:
                arr[0][2] = symbol;
                break;
            case 3:
                arr[0][4] = symbol;
                break;
            case 4:
                arr[2][0] = symbol;
                break;
            case 5:
                arr[2][2] = symbol;
                break;
            case 6:
                arr[2][4] = symbol;
                break;
            case 7:
                arr[4][0] = symbol;
                break;
            case 8:
                arr[4][2] = symbol;
                break;
            case 9:
                arr[4][4] = symbol;
                break;
        }
    }

    public static void PrintGameBoard(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
