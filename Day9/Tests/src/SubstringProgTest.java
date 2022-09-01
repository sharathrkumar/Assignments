import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringProgTest {

    @Test
    void subStr() {
        SubstringProg c = new SubstringProg();
        assertEquals("hellohi",c.subStr("hihellohi"));
    }
}