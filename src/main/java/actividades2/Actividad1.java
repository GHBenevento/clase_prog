package actividades2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esbribe un numero.");
        String number = sc.nextLine();
        int numb = parseInt(number);
        System.out.println((char)+numb);
    }
}
