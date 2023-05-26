import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter data based below list to throw error: ");
        System.out.println("001: for UserAlreadyExistsException");
        System.out.println("0012: for UserNotFoundException");
        System.out.println("N123: for DataTypeMustBeNumberException");

        String input = sc.next();

        try {
            switch (input) {
                case "001" -> throw new UserAlreadyExistsException("User already exists with this id.");
                case "0012" -> throw new UserNotFoundException("User not exists with this id");
                case "N123" -> throw new DataTypeMustBeNumberException("Data must be number.");
                case "null" -> throw new NullPointerException();
                default -> System.out.println("Program has been executed without throwing any exception...");
            }
        } catch (UserAlreadyExistsException | UserNotFoundException | DataTypeMustBeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed.");
        }
    }
}