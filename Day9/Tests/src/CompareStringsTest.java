import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareStringsTest {

    @Test
    void compareStrings() {
        CompareStrings cs = new CompareStrings();
        assertEquals("Both the Strings contains Same Data",cs.compareStrings("Java","Java"));
        assertEquals("Both the Strings contains Same Data",cs.compareStrings("Java","Java"));
    }
}