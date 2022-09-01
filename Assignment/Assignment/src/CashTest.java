import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void authorized() {
        Payment p = new Cash(1000,1000);
        assertEquals("Cash received Successfully.", p.authorized());

    }
}