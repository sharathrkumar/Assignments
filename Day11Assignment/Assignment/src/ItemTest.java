import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getPriceForQuantity() {
        Item item = new Item("pizza");
        assertEquals(100, item.getPriceForQuantity());
    }
}