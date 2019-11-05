package pl.sages.craft.cleancode.singleresponsibility;

public class EmailSender {
    public void send(String from, String to, String subject, String message){
        Email email = new Email(from, to, subject, message);
        if (email.send()) {
            System.out.println("Email sent");
        }
        else {
                System.out.println("Email not sent");
        }
    }
}
