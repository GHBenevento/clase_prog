package actividades2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Actividad8 {
    public static void main(String[] args) {
        int numb;
        do {
            System.out.println("Esbribe un numero mayor que 0.");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            numb = parseInt(number);
        }while (numb < 0);
        System.out.println("Escribiste el numero "+numb);
    }
}
