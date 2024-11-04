package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class HandlerOfWeekDaysTest {
    private HandlerOfWeekDays handler = new HandlerOfWeekDays();
    @Test
    void testGetWeekDays() {
        List<String> days = handler.getWeekDays();

        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
        assertTrue(days.contains("Tuesday"));
        assertTrue(days.contains("Wenesday"));
    }

    @Test
    void testShowAllWeekdays() {

    }

    @Test
    void testSizeOfWeek() {

    }

    @Test
    void testRemoveDay() {

    }
    

    @Test
    void testGetDay() {

    }

    @Test
    void testGetDayIfExists() {

    }

    @Test
    void testSortDaysAlphabetically() {

    }

    @Test
    void testClearList() {

    }
}
