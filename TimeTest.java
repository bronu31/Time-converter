import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {


    @Test
    void TestForZero() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0));


    }
    @Test
    void TestBig(){
        assertEquals( "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }@Test
    void TestSmall(){
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
    }
}