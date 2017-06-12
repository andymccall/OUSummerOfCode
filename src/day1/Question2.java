package day1;

import java.util.ArrayList;

/**
 * Created by Andy McCall on 12/06/2017.
 */
public class Question2 {

    public static Holiday cheapestHolidays(int paidSurcharge, ArrayList<Holiday> holidays) {

        Holiday cheapestHoliday = new Holiday();
        int cheapestPrice=-1;

        for (Holiday holiday : holidays) {

            int cost;

            if (holiday.getSurcharge() < paidSurcharge) {
                cost = holiday.getPrice() + holiday.getSurcharge();
            } else {
                cost = holiday.getPrice() + (holiday.getSurcharge()-paidSurcharge);
            }

            if (cheapestPrice == -1 || cost < cheapestPrice) {
                cheapestPrice = cost;
                cheapestHoliday = holiday;
            }

        }

        return cheapestHoliday;
    }

    public static void main(String[] args) {

        HolidayPackages holidayPackages = new HolidayPackages("resources/00-prices.txt");

        System.out.println(cheapestHolidays(500,holidayPackages.getHolidays()));

        return ;

    }

}
