package Java.FormatTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeExamples {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("AM-PM: " + now.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
        System.out.println("ISO date-time: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Date: " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        for (String zone : new String[]{"Asia/Kolkata", "Europe/London", "America/New_York", "Asia/Tokyo"}) {
            System.out.println(zone + ": " + now.withZoneSameInstant(ZoneId.of(zone)).format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm z", Locale.US)));
        }
        System.out.println("GMT: " + now.withZoneSameInstant(ZoneId.of("GMT")));
        System.out.println("Current instant: " + Instant.now());
    }
}