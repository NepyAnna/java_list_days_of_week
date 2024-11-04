package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
    void testSizeOfWeek() {
        int size = handler.sizeOfWeek();

        assertEquals(7, size);
    }

    @Test
    void testRemoveDay() {
        List<String> days = handler.getWeekDays();

        handler.removeDay("Monday");

        assertFalse(days.contains("Monday"));
    }
    

    @Test
    void testGetDay() {
        assertEquals("Monday", handler.getDay(0));
        assertEquals("Wrong index!", handler.getDay(10));
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
