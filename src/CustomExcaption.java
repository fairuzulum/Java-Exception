public class CustomExcaption {
    public static void main(String[] args) {
        try {
            validateAge(3);
        } catch (AgeLessThanZeroExcaption e) {
            throw new RuntimeException(e);
        }
    }

    private static void validateAge(int age) throws AgeLessThanZeroExcaption {
        if (age < 0) {
            throw new AgeLessThanZeroExcaption();
        }
    }
}
