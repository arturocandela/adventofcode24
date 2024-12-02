package com.adventofcode.arturocandela.dos;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class RedNoseReportsTest {
    @Test
    void testCheckReport() {

        RedNoseReports reports = new RedNoseReports(null);

        assertTrue(reports.reportIsSafe("1 2 3 4 5"));


    }

    @Test
    void testCountSafeReports() {
        
        RedNoseReports reports = new RedNoseReports("/Users/arturo/Documents/desarrollo/adventofcode24/src/test/resources/input.txt");

        try {

            int rightReports = reports.countSafeReports();

            assertTrue(rightReports >= 1);

        } catch (Exception e){
            fail(e);
        }


    }
}
