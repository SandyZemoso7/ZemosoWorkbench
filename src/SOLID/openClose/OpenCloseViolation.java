package SOLID.openClose;

public class OpenCloseViolation {
    public void sendMessage(String platform, String recipient, String message) {
        if (platform.equals("Email")) {
            // send email message
        } else if (platform.equals("SMS")) {
            // send SMS message
        }
        // ...more messaging platforms
    }
}
