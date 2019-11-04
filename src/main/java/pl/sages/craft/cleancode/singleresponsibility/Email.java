package pl.sages.craft.cleancode.singleresponsibility;

/**
 * @author krogulecp
 */
//TODO Refactor aby była zachowana Single Responsibility Principle
class Email {
    private String from;//testowa
    private String to;
    private String subject;
    private String message;

    public void send(){
        System.out.println("sending email");
    }

    public void validate(){
        if (message.contains("polityka")){
            System.out.println("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
