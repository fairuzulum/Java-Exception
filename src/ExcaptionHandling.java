import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcaptionHandling {
    public static void main(String[] args) {
boolean flag = true;
        while (flag) {
            try {
                // kode yang mungkin akan meempar exception
                Scanner scanner = new Scanner(System.in);
                String  input = scanner.nextLine();
                Integer num = Integer.parseInt(input);
                System.out.println(num);
                flag = false;
            } catch (NumberFormatException e){
                // kode yang ingin kita eksekusi jka exceptionnya muncul
                System.out.println(e.getMessage() + " is not a valid number");
            }
        }
        System.out.println("Finish");
    }
}
