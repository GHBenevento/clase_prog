package actividades2;
import java.util.Scanner;
import static java.lang.Float.parseFloat;
public class Actividad3 {
    public static void main(String[] args) {
        System.out.println("Esbribe un precio y le anyado el IVA.");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            float numb = parseFloat(number);
            System.out.println(numb+(numb*0.21));
        }

}
