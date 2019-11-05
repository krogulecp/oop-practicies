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
    public void validate() {

    }
}
