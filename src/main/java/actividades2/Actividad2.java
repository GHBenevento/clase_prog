package actividades2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Actividad2 {
    public static void main(String[] args) {
        System.out.println("Esbribe una letra.");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        char character = letter.charAt(0);
        System.out.println((int) character);
    }
}