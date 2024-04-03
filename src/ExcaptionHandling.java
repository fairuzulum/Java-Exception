public class ExcaptionHandling {
    public static void main(String[] args) {

        try {
            // kode yang mungkin akan meempar exception
            Integer num = Integer.parseInt("cat");
//            System.out.println(num);
        }catch (NumberFormatException nfe){
            // kode yang ingin kita eksekusi jka exceptionnya muncul
            System.out.println(nfe.getMessage() + " is not a valid number");
        }
    }
}
