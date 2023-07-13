package SOLID.liskovSubstitution;

public class LiskovSubstitutionSolution {
    public abstract class MessageSender {
        public abstract void sendMessage(String message);
    }

    public class DefaultMessageSender extends MessageSender {
        public void sendMessage(String message) {
            // send message
        }
    }

    public class SecureMessageSender extends MessageSender {
        public void sendMessage(String message) {
            // additional security checks and then send message
        }
    }
}
