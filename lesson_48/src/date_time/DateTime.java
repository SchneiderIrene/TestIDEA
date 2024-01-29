package date_time;

import java.time.*;
import java.util.Iterator;
import java.util.Set;

public class DateTime {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(15, 30, 35);
        System.out.println("hour: " + localTime2.getHour());
        System.out.println("minutes: " + localTime2.getMinute());

        LocalTime localTime3 = LocalTime.of(19, 40,20);
        System.out.println(localTime3.plusHours(2));
        System.out.println(localTime3.plusMinutes(10));
        System.out.println(localTime3.plusSeconds(20));
        System.out.println(localTime3.minusHours(2));
        System.out.println(localTime3.minusMinutes(10));
        System.out.println(localTime3.minusSeconds(20));

        LocalTime localTime4 = LocalTime.of(15, 30);
        System.out.println(localTime4.isBefore(LocalTime.now()));
        System.out.println(localTime4.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2022, 1, 30);
        System.out.println(localDate2);

        System.out.println("Is 2024 a leap year? " + localDate1.isLeapYear());
        System.out.println("Is 2022 a leap year? " + localDate2.isLeapYear());

        LocalDate localDate3 = localDate1.minusDays(1);
        System.out.println(localDate3);

        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.lengthOfMonth());
        System.out.println(localDate1.lengthOfYear());


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime
                .of(2024,1, 29, 12, 46, 34);
        System.out.println(localDateTime1);

        Set <String> avialabeleZoneID = ZoneId.getAvailableZoneIds();
        System.out.println(avialabeleZoneID);

        LocalDateTime localDateTime2 = LocalDateTime.now();
        ZoneId london  = ZoneId.of("Europe/London");

        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println(inLondon);

        ZonedDateTime inBerlin = ZonedDateTime.now();
        System.out.println(inBerlin);

        Set<String>zoneIDs = ZoneId.getAvailableZoneIds();
        zoneIDs.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------");

        Iterator<String> iterator = zoneIDs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
