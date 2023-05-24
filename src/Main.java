public class Main {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();
        try {
            thrower.throwExceptions();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}