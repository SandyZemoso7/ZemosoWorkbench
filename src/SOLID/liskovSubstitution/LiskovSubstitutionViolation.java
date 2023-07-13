package SOLID.liskovSubstitution;

public class LiskovSubstitutionViolation {
    public class MessageSender {
        public void sendMessage(String message) {
            // send message
        }
    }

    public class SecureMessageSender extends MessageSender {
        @Override
        public void sendMessage(String message) {
            // additional security checks and then send message
        }
    }
}
