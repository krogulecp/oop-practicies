package pl.sages.craft.cleancode.singleresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void testuj(){
        Email email = new Email("A", "B", "Temat maila", "Treść polityka wiadomości");
        EmailValidator validator = new EmailValidator(email.getMessage());
        EmailSender sender = new EmailSender(email, validator);
        sender.send();
    }
}