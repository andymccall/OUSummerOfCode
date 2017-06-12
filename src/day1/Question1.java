package day1;

import java.util.ArrayList;

/**
 * Created by Andy McCall on 12/06/2017.
 */
public class Question1 {

    public static int countHolidaysAtLocation(String location, ArrayList<Holiday> holidays) {
        int locationCount=0;

        for (Holiday holiday : holidays) {
            if (holiday.getLocation().contains(location)) {
                locationCount++;
            }
        }

        return locationCount;
    }

    public static void main(String[] args) {

        HolidayPackages holidayPackages = new HolidayPackages("resources/00-prices.txt");

        System.out.println(countHolidaysAtLocation("Nullarbor", holidayPackages.getHolidays()));

        return ;

    }

}
