package actividades1;

import java.util.Scanner;

public class Actividad5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the radius of the circle: ");
        int rad = sc.nextInt();
        System.out.println(Math.PI * Math.pow(rad, 2));
    }

}
