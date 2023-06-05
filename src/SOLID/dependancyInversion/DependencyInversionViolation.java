package SOLID.dependancyInversion;

public class DependencyInversionViolation {
    public class NotificationService {
        private EmailSender emailSender;

        public NotificationService() {
            this.emailSender = new EmailSender();
        }

        public void sendNotification(String message) {
            emailSender.sendEmail(message);
        }
    }

    public class EmailSender {
        public void sendEmail(String message) {
            // logic to send an email
        }
    }
}
