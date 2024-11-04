package com.sheoanna;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        HandlerOfWeekDays weekDays = new HandlerOfWeekDays();
        weekDays.showAllWeekdays();
        
        System.out.println();
        System.out.println(weekDays.sizeOfWeek());

        System.out.println();
        weekDays.removeDay("Monday");
        weekDays.showAllWeekdays();

        
    }
}
