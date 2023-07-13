package SOLID.singleResponsibility;

public class SingleResponsibilityViolation {
    public class Message {
        public void composeMessage(String content) {
            // logic to compose the message
        }

        public void sendMessage(String recipient) {
            // logic to send the message to the recipient
        }
    }
}
