package SOLID.singleResponsibility;

public class SingleResponsibilityViolation {
    public class User {
        public void authenticate(String username, String password) {
            // authentication logic
        }

        public void updateName(String username) {
            // update username logic
        }
    }
}
