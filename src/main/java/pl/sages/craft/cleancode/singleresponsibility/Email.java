package pl.sages.craft.cleancode.singleresponsibility;

/**
 * @author krogulecp
 */
//TODO Refactor aby była zachowana Single Responsibility Principle
class Email {
    private String from;
    private String to;
    private String subject;
    private String message;

    public Email(){

    }

    public Email (String from, String to, String subject, String message){
        from = from;
        to = to;
        subject = subject;
        message = message;
    }
    public boolean send(){
        Validator validator = new Validator();
        boolean validate = validator.validate(message);
        return validate;
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

class Validator {
    boolean validate(String message) {
        if (message.contains("polityka")){
            System.out.println("sending not permitted");
            return false;
        } else {
            System.out.println("email valid");
            return true;
        }
    }
}