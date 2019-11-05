package pl.sages.craft.cleancode.singleresponsibility;

/**
 * @author krogulecp
 */
class EmailValidator implements Validator {
    private final String message;

    EmailValidator(String message) {
        this.message = message;
    }

    @Override
    public boolean validate(){
        if (message.contains("polityka")){
            System.out.println("sending not permitted");
            return false;
        } else {
            System.out.println("email valid");
            return true;
        }
    }
}
