/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heikki.timeUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author heikki
 */
public class TimeUtilsTest {
    
    public TimeUtilsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of timeToSec method, of class TimeUtils.
     */
    @ParameterizedTest
    @CsvSource({"'00:00:01', 1", "'11:59:59', '43199'", "'1:00:00',  3600"})
    public void testTimeToSec(String time, int expected) {
        int result = TimeUtils.timeToSec(time);
        assertEquals(expected, result);
    }

    /**
     * Test of secToTime method, of class TimeUtils.
     */
    @ParameterizedTest
    @CsvSource({"1, '0:00:01'", "3, '0:00:03'", "-3, '-1'", "3665, '1:01:05'", 
        "86395, '23:59:55'", "86400, '0:00:00"}) 
    public void testSecToTime(int input, String expected) {
        String result = TimeUtils.secToTime(input);
        assertEquals(expected, result);
    }
    
}
