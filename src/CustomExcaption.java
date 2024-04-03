public class CustomExcaption {
    public static void main(String[] args) throws AgeLessThanZeroExcaption {
            validateAge(-1);
    }

    private static void validateAge(int age) throws AgeLessThanZeroExcaption {
        if (age < 0) {
            throw new AgeLessThanZeroExcaption("age is less than zero");
        }
    }
}
