package day1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Andy McCall on 12/06/2017.
 */
public class HolidayPackages {

    private ArrayList<Holiday> holidays = new ArrayList<Holiday>();

    public HolidayPackages(String holidayPackageFile) {

        try {
            for (String line : Files.readAllLines(Paths.get(holidayPackageFile))) {

                String[] splitLine = line.split("\\s+");

                Holiday holiday = new Holiday();

                holiday.setDealId(splitLine[0]);
                holiday.setPrice(Integer.parseInt(splitLine[1]));
                holiday.setLocation(splitLine[2]);
                holiday.setSurcharge(Integer.parseInt(splitLine[3]));

                holidays.add(holiday);

            }
        } catch (Exception e) {
            System.out.println("Error was caught:");
            System.out.println(e.fillInStackTrace());
        }
    }

    public ArrayList<Holiday> getHolidays() {
        return holidays;
    }

    @Override
    public String toString() {
        return "HolidayPackages{" +
                "holidays=" + holidays +
                '}';
    }
}
