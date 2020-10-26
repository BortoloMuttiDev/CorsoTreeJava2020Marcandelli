import java.util.Arrays;
import java.util.Scanner;

public class MyLabyrinth {


    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);


        char[][] lab = new char[5][5];
        for (int i = 0; i < lab.length; i++)
            for (int j = 0; j < lab[0].length; j++)
                lab[i][j] = '-';
        lab[0][2] = 'W';
        lab[0][3] = 'W';
        lab[1][1] = 'W';
        lab[1][3] = 'W';
        lab[2][0] = 'P';
        lab[2][1] = 'W';
        lab[2][3] = 'W';
        lab[2][4] = 'W';
        lab[3][2] = 'W';
        lab[3][4] = 'E';
        lab[4][0] = 'W';
        lab[4][4] = 'W';



       printArray2D(lab);

        while (true){
            char mossa = m.next().toUpperCase().charAt(0);
            move(lab,mossa);
            printArray2D(lab);
            if(checkPlayerWin(lab))
                break;




        }
        System.out.println("GG EZ");

    }



    public static void printArray2D(char[][] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
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
                    break;
                }
            }
        }
        return posizione;
    }

    public static void move(char[][] lab, char move) {




        switch (move) {

            case 'W':
             checkCellaUp(lab);
             break;

            case 'D':
                checkCellaRight(lab);
            break;

            case 'S':
               checkCellaDown(lab);
            break;

            case 'A':
               checkCellaLeft(lab);
               break;
        }

    }


    public static char [] [] checkCellaUp(char[][] lab) {
        int[] posizione = findPlayer(lab);
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
    public static char [] [] checkCellaRight(char[][] lab) {
        int[] posizione = findPlayer(lab);
        int rowp = posizione[0];
        int colp = posizione[1];

        if (colp + 1 >= lab[0].length || lab[rowp][colp + 1] == 'W'){
            System.out.println("You cannot move outside boundaries");
        return lab;
    }else

            lab[rowp][colp+1] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }
    public static char [] [] checkCellaDown(char[][] lab) {
        int[] posizione = findPlayer(lab);
        int rowp = posizione[0];
        int colp = posizione[1];

        if (rowp + 1 >= lab.length || lab[rowp + 1][colp] == 'W') {
            System.out.println("You cannot move outside boundaries");
            return lab;
        }else
            lab[rowp+1][colp] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }
    public static char [] [] checkCellaLeft(char[][] lab) {
        int[] posizione = findPlayer(lab);
        int rowp = posizione[0];
        int colp = posizione[1];

        if (colp - 1 < 0 || lab[rowp][colp - 1] == 'W'){
            System.out.println("You cannot move outside boundaries");
        return lab;
    }else
            lab[rowp][colp-1] = 'P';
        lab[rowp][colp] = '-';



        return lab;

    }

    public static boolean checkPlayerWin(char[][] lab) {
        for (int i = 0; i < lab.length; i++)
            for (int j = 0; j < lab[0].length; j++)
                if (lab[i][j] == 'E')
                    return false;
        return true;
    }
}