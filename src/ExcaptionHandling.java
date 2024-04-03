import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcaptionHandling {
    public static void main(String[] args) {
    boolean flag = true;
        cekinput(flag);
        System.out.println(getInt());

    }

    public static void cekinput(boolean flag) {
        while (flag) {
            try {
                // kode yang mungkin akan meempar exception
                Scanner scanner = new Scanner(System.in);
                System.out.print("Input a number: ");
                String  input = scanner.nextLine();
                Integer num = Integer.parseInt(input);
                System.out.println("Yang anda input: " + num);
                flag = false;
            } catch (NumberFormatException e){
                // kode yang ingin kita eksekusi jka exceptionnya muncul
                System.out.println(e.getMessage() + " is not a valid number");
            } finally {
                System.out.println("ini block finaly");
            }
        }
        System.out.println("Finish");
    }

    private static int getInt(){
        try{
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }


}
