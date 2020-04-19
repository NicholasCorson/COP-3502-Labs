import java.util.Scanner;
import java.util.Arrays;

public class ConnectFour {

    public static void printBoard(char[][] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i][0]);

            for (int j = 0; j < array[0].length; j++) {

                array[i][j] = '-';

                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }
    }



    public static void initializeBoard(char[][]array){

        printBoard(array);

    }




    public static int insertChip(char[][] array, int col, char chipType){

        char[][] insertArray;

        for (int i = 0; i < array.length; i++) {

            array[i][0] = '-';

            if ((i == array.length - col - 1) && (col == 0)) {
                array[i][0] = chipType;
            }

            System.out.print(array[i][0]);

            for (int j = 1; j < array[0].length; j++) {

                array[i][j] = '-';

                if ((j == col) && (i == array.length - 1)) {
                    array[i][j] = chipType;
                }

                System.out.print(" " + array[i][j]);

            }
            System.out.println("");
        }

        return 0;
    }

    //public static boolean checkIfWinner(char[][] array, int col, int row, charchipType){}

    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);

        int height;
        int length;
        char[][] array;
        char chipType;
        int column;

        System.out.println("What would you like the height of the board to be? ");
        height = scnr.nextInt();
        System.out.println("What would you like the length of the board to be? ");
        length = scnr.nextInt();

        array = new char [height][length];

        initializeBoard(array);

        System.out.println("Player 1: x");
        System.out.println("Player 2: o");

        do {

            System.out.println("Player 1: Which column would you like to choose? ");
            chipType = 'x';
            insertChip(array, scnr.nextInt(), chipType);

            System.out.println("Player 2: Which column would you like to choose? ");
            chipType = 'o';
            insertChip(array, scnr.nextInt(), chipType);

        } while (0 == 0);

    }
}
