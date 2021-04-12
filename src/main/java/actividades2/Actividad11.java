package actividades2;

import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Actividad11 {
    public static void main(String[] args) {
        System.out.println("Escribe dos numeros.");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        float numb1 = parseFloat(num1);
        String num2 = sc.nextLine();
        float numb2 = parseFloat(num2);
        for (int i = 0; i < 11; i++) {
                System.out.println(Math.random()*(numb1-numb2)+numb2);
        }
    }
}
