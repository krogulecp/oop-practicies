package pl.sages.craft.cleancode.singleresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldSend() {
        //given
        //when
        Email email = new Email();
        email.setMessage("Test polityka test");
        email.send();

        //then
        //Bez then, chcę tylko odpalić send()
    }
}