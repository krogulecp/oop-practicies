package pl.sages.craft.cleancode.singleresponsibility;

/**
 * @author krogulecp
 */
class EmailSender implements Sender {

    private final Email email;
    private final Validator validator;

    EmailSender(Email email, Validator validator) {
        this.email = email;
        this.validator = validator;
    }

    @Override
    public void send() {
        validator.validate();
    }
}
