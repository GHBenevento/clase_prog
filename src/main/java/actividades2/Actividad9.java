package actividades2;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        String cont = "Georgie";
        String guess;
        int i=3;
        do {
            System.out.println("Escribe la contrasenya.");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextLine();
            if (guess.equals(cont)){
                System.out.println("Enhorabuena!");
            }
            i--;
        }while(!guess.equals(cont) && i!=0);
    }
}
