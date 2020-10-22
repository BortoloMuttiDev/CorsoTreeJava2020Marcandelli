import java.util.Arrays;
import java.util.Scanner;

public class Labyrinth {


    public static void main(String[] args) {
        char[][] lab = createLab();
       printArray2D(lab);

        int [] position = findPlayer(lab);

        move(position,lab);
        printArray2D(lab);

        move(position,lab);
        printArray2D(lab);

        move(position,lab);
        printArray2D(lab);

        move(position,lab);

        printArray2D(lab);


    }

    public static char[][] createLab() {

        char[][] labyrinth = new char[5][5];
        for (int i = 0; i < labyrinth.length; i++)
            for (int j = 0; j < labyrinth[0].length; j++)
                labyrinth[i][j] = '-';
        labyrinth[0][2] = 'W';
        labyrinth[0][3] = 'W';
        labyrinth[1][1] = 'W';
        labyrinth[1][3] = 'W';
        labyrinth[2][0] = 'P';
        labyrinth[2][1] = 'W';
        labyrinth[2][3] = 'W';
        labyrinth[2][4] = 'W';
        labyrinth[3][2] = 'W';
        labyrinth[3][4] = 'E';
        labyrinth[4][0] = 'W';
        labyrinth[4][4] = 'W';

        return labyrinth;
    }

    public static void printArray2D(char[][] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            //System.out.print("[");
            for (int j = 0; j < arrayInt[0].length; j++) {
                System.out.print(arrayInt[i][j]);
                if (j != arrayInt[0].length - 1) System.out.print("  ");
            }
            System.out.println("");
        }


    }

    public static int[] findPlayer(char[][] lab) {
        int[] posizione = new int[2];
        for (int row = 0; row < lab.length; row++) {
            for (int col = 0; col < lab[0].length; col++) {
                if (lab[row][col] == 'P') {
                    posizione[0] = row;
                    posizione[1] = col;
                }
            }
        }
        return posizione;
    }

    public static void move(int posizione[],char[][] lab) {


        Scanner m = new Scanner(System.in);
        char move = m.next().charAt(0);

        switch (move) {

            case 'W':
             checkCellaUp(posizione,lab);
             break;

            case 'D':
                checkCellaRight(posizione,lab);
            break;
            case 'S':
               checkCellaDown(posizione,lab);
            break;
            case 'A':
               checkCellaLeft(posizione,lab);
               break;
        }

    }


    public static char [] [] checkCellaUp(int[] posizione, char[][] lab) {
        int rowp = posizione[0];
        int colp = posizione[1];

                if (rowp - 1 < 0 || lab[rowp - 1][colp] == 'W') {

                    System.out.println("You cannot move outside boundaries");
                    return lab;
                }else
            lab[rowp-1][colp] = 'P';
            lab[rowp][colp] = '-';



        return lab;

    }
    public static char [] [] checkCellaRight(int[] posizione, char[][] lab) {
        int rowp = posizione[0];
        int colp = posizione[1];

        if (colp + 1 > lab.length || lab[rowp][colp + 1] == 'W'){
            System.out.println("You cannot move outside boundaries");
        return lab;
    }

            lab[rowp][colp+1] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }
    public static char [] [] checkCellaDown(int[] posizione, char[][] lab) {
        int rowp = posizione[0];
        int colp = posizione[1];

        if (rowp + 1 < lab.length || lab[rowp + 1][colp] == 'W') {
            System.out.println("You cannot move outside boundaries");
            return lab;
        }
            lab[rowp+1][colp] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }
    public static char [] [] checkCellaLeft(int[] posizione, char[][] lab) {
        int rowp = posizione[0];
        int colp = posizione[1];

        if (colp - 1 < 0 || lab[rowp][colp - 1] == 'W'){
            System.out.println("You cannot move outside boundaries");
        return lab;
    }
            lab[rowp][colp-1] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }
}