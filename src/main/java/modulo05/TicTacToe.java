package modulo05;

import java.util.Random;

public class TicTacToe {

    public static void main (String [] args){
        int c = 0;
        TicTacToe tris = new TicTacToe();

            while (checkVictory == false) {

                tris.mossaGiocatore(tris.getMatrice());
            }


    }

    private Sign[][] matrice = new Sign[3][3];
    private  int conta= 0;
    private static boolean checkVictory = false;


   public TicTacToe(){
       for (int i = 0; i < matrice.length; i++)
           for (int j = 0; j < matrice[0].length; j++)
               matrice[i][j] = Sign.VUOTO;
       this.matrice= matrice;

   }

   public Sign[][] getMatrice(){
       return matrice;
   }



public void stampaStatus(){
    for (int i = 0; i < matrice.length; i++) {
        for (int j = 0; j <  matrice[0].length; j++) {
            System.out.print( matrice[i][j]);
            if (j !=  matrice[0].length - 1) System.out.print("  ");
        }
        System.out.println(" ");
    }
    System.out.println("\n");
}

public void mossaGiocatore(Sign[][] matrice){
    int[] posizione;
    int x = (int) (Math.random() * 3);
    int y = (int) (Math.random() * 3);

            if (matrice[x][y] == Sign.VUOTO) {

                if (conta % 2 == 0)
                    matrice[x][y] = Sign.X;
                else
                    matrice[x][y] = Sign.O;
                conta++;

            }
            if (hasWonO(matrice, x, y)||hasWonX(matrice,x,y)) {
                checkVictory = true;
                System.out.println("You Won");
            }
    stampaStatus();

   }



       public static boolean hasWonO(Sign[][] matrice,
               int currentRow, int currentCol) {

           return (matrice[currentRow][0] == Sign.O
                   && matrice[currentRow][1] == Sign.O
                   && matrice[currentRow][2] == Sign.O
                   || matrice[0][currentCol] == Sign.O
                   && matrice[1][currentCol] == Sign.O
                   && matrice[2][currentCol] == Sign.O
                   || currentRow == currentCol
                   && matrice[0][0] == Sign.O
                   && matrice[1][1] == Sign.O
                   && matrice[2][2] == Sign.O
                   || currentRow + currentCol == 2
                   && matrice[0][2] == Sign.O
                   && matrice[1][1] == Sign.O
                   && matrice[2][0] == Sign.O);
       }

    public static boolean hasWonX(Sign[][] matrice,
                                 int currentRow, int currentCol) {

        return (matrice[currentRow][0] == Sign.X
                && matrice[currentRow][1] == Sign.X
                && matrice[currentRow][2] == Sign.X
                || matrice[0][currentCol] == Sign.X
                && matrice[1][currentCol] == Sign.X
                && matrice[2][currentCol] == Sign.X
                || currentRow == currentCol
                && matrice[0][0] == Sign.X
                && matrice[1][1] == Sign.X
                && matrice[2][2] == Sign.X
                || currentRow + currentCol == 2
                && matrice[0][2] == Sign.X
                && matrice[1][1] == Sign.X
                && matrice[2][0] == Sign.X);
    }


}
