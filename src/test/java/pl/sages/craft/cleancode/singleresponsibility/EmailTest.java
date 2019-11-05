package pl.sages.craft.cleancode.singleresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldSend() {
        //given
        //when
        EmailSender sender = new EmailSender();
        sender.send("a", "b", "temat", "Wiadomość");

        //then
        //Bez then, chcę tylko odpalić send()
    }
}