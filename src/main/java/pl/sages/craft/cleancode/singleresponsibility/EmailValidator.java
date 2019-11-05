package pl.sages.craft.cleancode.singleresponsibility;

public class EmailValidator {
    public void validate(){
        if (message.contains("polityka")){
            System.out.println("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}
