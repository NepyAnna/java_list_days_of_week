package com.sheoanna;

import java.util.ArrayList;
import java.util.List;

public class HandlerOfWeekDays {
    public List<String> weekDays;

    public HandlerOfWeekDays() {
        createListOfWeekDays();
    }

    public List<String> getWeekDays() {
        return weekDays;
    }

    public void createListOfWeekDays() {
        List<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wenesday");
        weekDays.add("Thusday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sanday");
    }
}
