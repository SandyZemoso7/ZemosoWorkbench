package SOLID.openClose;

public class OpenCloseSolution {
    public interface MessagePlatform {
        void sendMessage(String recipient, String message);
    }

    public class EmailPlatform implements MessagePlatform {
        public void sendMessage(String recipient, String message) {
            // send email message
        }
    }

    public class SMSPlatform implements MessagePlatform {
        public void sendMessage(String recipient, String message) {
            // send SMS message
        }
    }
}
