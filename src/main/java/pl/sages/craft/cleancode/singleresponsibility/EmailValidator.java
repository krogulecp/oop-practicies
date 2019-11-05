package pl.sages.craft.cleancode.singleresponsibility;

class EmailValidator {

    public static void validate(Email email) {
        if (email.getMessage().contains("polityka")) {
            System.out.println("sending not permitted");
        } else {
            System.out.println("email valid");
        }
    }
}