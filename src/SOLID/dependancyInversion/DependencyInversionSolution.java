package SOLID.dependancyInversion;

public class DependencyInversionSolution {
    public interface MessageSender {
        void sendMessage(String message);
    }

    public class NotificationService {
        private MessageSender messageSender;

        public NotificationService(MessageSender messageSender) {
            this.messageSender = messageSender;
        }

        public void sendNotification(String message) {
            messageSender.sendMessage(message);
        }
    }

    public class EmailSender implements MessageSender {
        public void sendMessage(String message) {
            // logic to send an email
        }
    }
}
