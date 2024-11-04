package com.sheoanna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandlerOfWeekDays {
    public List<String> weekDays;

    public HandlerOfWeekDays() {
        createListOfWeekDays();
    }

    public void createListOfWeekDays() {
        weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wenesday");
        weekDays.add("Thusday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sanday");
    }

    public List<String> getWeekDays() {
        return weekDays;
    }

    public void showAllWeekdays(){
        for(String day: weekDays) {
            System.out.println(day);
        }
    }

    public Integer sizeOfWeek () {
        return this.weekDays.size();
    }

    
}
