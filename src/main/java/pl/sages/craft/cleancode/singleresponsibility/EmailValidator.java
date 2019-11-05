package pl.sages.craft.cleancode.singleresponsibility;

public class EmailValidator {
    private Email email;
    public void validate(){
        if (email.getMessage.contains("polityka")){
            System.out.println("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}
