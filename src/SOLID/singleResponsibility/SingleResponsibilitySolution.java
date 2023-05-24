package SOLID.singleResponsibility;

public class SingleResponsibilitySolution {
    public class AuthenticationService {
        public void authenticate(String username, String password) {
            // authentication logic
        }
    }

    public class UserProfileService {
        public void updateName(String username) {
            // update username logic
        }
    }
}
