import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {

    @org.junit.jupiter.api.Test
    void timeCal() {
        assertEquals(1.0, timecal.timeCalulator(3600, 3600));
    }
}