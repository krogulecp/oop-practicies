package pl.sages.craft.cleancode.singleresponsibility;

public class EmailWriter {

    public EmailWriter() {
    }

    public Email createEmail(String from, String to, String subject, String message){
        Email email = new Email();
        email.setFrom(from);
        email.setTo(to);
        email.setSubject(subject);
        email.setMessage(message);
        return email;
    }

    public void send() {
        System.out.println("sending email");
    }
}