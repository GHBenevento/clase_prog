package actividades2;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esbribe un numero entero.");
        String number = sc.nextLine();
        System.out.println("Ese numero tiene " + number.length() + " cifra(s).");
    }
}
