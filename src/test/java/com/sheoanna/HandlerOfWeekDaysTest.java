package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        assertEquals("Monday",handler.getDayIfExists("Monday"));
        assertEquals("Day does not exist in list now!", handler.getDayIfExists("Not exist day!"));
    }

    @Test
    void testSortDaysAlphabetically() {
        handler.sortDaysAlphabetically();

        assertEquals("Friday", handler.getDay(0));
    }

    @Test
    void testClearList() {
        handler.clearList();
        assertEquals(0,handler.sizeOfWeek());
    }

    @Test
    void testShowAllWeekDays(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outputStream));

        handler.showAllWeekdays();

        String expectedOutPut = String.join(System.lineSeparator(),"Monday", "Tuesday", "Wenesday", "Thusday", "Friday", "Saturday", "Sanday") + System.lineSeparator();

        assertEquals(expectedOutPut, outputStream.toString());

        System.setOut(originalOut);
    }
}
