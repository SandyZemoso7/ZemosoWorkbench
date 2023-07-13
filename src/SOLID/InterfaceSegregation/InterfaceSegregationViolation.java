package SOLID.InterfaceSegregation;

public class InterfaceSegregationViolation {
    public interface Messenger {
        void sendTextMessage(String recipient, String message);
        void sendVoiceMessage(String recipient, String message);
        void sendImageMessage(String recipient, String image);
    }

    public class ChatMessenger implements Messenger {
        @Override
        public void sendTextMessage(String recipient, String message) {

        }

        @Override
        public void sendVoiceMessage(String recipient, String message) {

        }

        @Override
        public void sendImageMessage(String recipient, String image) {

        }
        // implementation
    }
}
