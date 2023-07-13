package SOLID.InterfaceSegregation;

public class InterfaceSegregationSolution {
    public interface TextMessenger {
        void sendTextMessage(String recipient, String message);
    }

    public interface VoiceMessenger {
        void sendVoiceMessage(String recipient, String message);
    }

    public interface ImageMessenger {
        void sendImageMessage(String recipient, String image);
    }

    public class ChatMessenger implements TextMessenger {
        @Override
        public void sendTextMessage(String recipient, String message) {

        }
        // implementation
    }
}
