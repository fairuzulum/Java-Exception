import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcaptionHandling {
    public static void main(String[] args) {
//        System.out.println(getInt());

//        boolean flag = true;
//        while (flag) {
//            try {
//                // kode yang mungkin akan meempar exception
////                Scanner scanner = new Scanner(System.in);
////                System.out.print("Input a number: ");
////                String input = scanner.nextLine();
////                Integer num = Integer.parseInt(input);
////                System.out.println("Yang anda input: " + num);
//
//                flag = false;
//            } catch (NumberFormatException e) {
//                // kode yang ingin kita eksekusi jka exceptionnya muncul
//                System.out.println(e.getMessage() + " is not a valid number");
//            } finally {
//                System.out.println("ini block finaly");
//            }
//        }
//        System.out.println("Finish");

        checkedExceptionWithTryCatch();

    }

    // CheckExcaption

//    private static void checkExcaptionWithThrows() throws FileNotFoundException {
//        File file = new File("./excaptions.txt");
//        FileInputStream stream = new FileInputStream(file);
//    }

    private static void checkedExceptionWithTryCatch() {
        File file = new File("not_existing_file.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    private static int getInt () {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
