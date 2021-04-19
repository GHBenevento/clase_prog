package actividades2;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        System.out.println("Esbribe un precio y le anyado el IVA.");
        Scanner sc = new Scanner(System.in);
        float numb = sc.nextFloat();
        System.out.println(numb + (numb * 0.21));
    }

}
