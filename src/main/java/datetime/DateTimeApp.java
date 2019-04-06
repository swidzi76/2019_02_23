package datetime;


// ZADANIE 1
// Za pomocą klasy Calendar stwórz obiekt klasy Date,
// który reprezentuje datę i godzinę Twoich urodzin. Wyświetl ją na konsolę.

// ZADANIE 2
// Wyświetl na konsoli datę z pkt 1 z nazwą miesiąca i nazwą dnia tygodnia.

// ZADANIE 3
// Wyświetl na konsoli datę z pkt 1, ale uwzględniając strefę czasową: Tokio w Japonii i Hawaii w USA

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApp {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(1976, 11, 26);
//        Date date = calendar.getTime();
//        System.out.println(date);
//        Date now = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy - MM - dd");
//        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("USA/Hawaii"));
//        System.out.println(" data to " + simpleDateFormat.format(now));
//
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("LocalDatTime.now");
//        System.out.println(localDateTime);
//        System.out.println("LocalDateTime1 dla 1976-12-26 12.00");
//        LocalDateTime localDateTime1 = LocalDateTime.of(1976,12,26,12,00);
//        System.out.println(localDateTime1);
// ---------------------------------------------------------------

//        LocalDate initialDateJustyna  = LocalDate.parse("1978-02-12");
//        LocalDate initialDateJarek  = LocalDate.parse("1976-12-26");
//        LocalDate initialDateMichal  = LocalDate.parse("2005-06-18");
//        LocalDate finalDate = LocalDate.now();
//        Period periodJustyna = Period.between(finalDate, initialDateJustyna);
//        Period periodJarek = Period.between(finalDate, initialDateJarek);
//        Period periodMichal = Period.between(finalDate, initialDateMichal);
//        System.out.println("Wiek Justyny " + periodJustyna);
//        System.out.println("Wiek Jarka " + periodJarek);
//        System.out.println("Wiek Michała " + periodMichal);
//        System.out.println(" jarek jest starszy od justyny o "+ Period.between(initialDateJustyna, initialDateJarek));
//        System.out.println(" jarek jest starszy od michała o "+ Period.between(initialDateMichal, initialDateJarek));
////        System.out.println("Dzień tygodnia urodzin: " + initialDate.getDayOfWeek();
        // ------------------------------------------------------------------------------------------------------
          System.out.println(" -------------------------------- ZADANIE 4 ---------------------------------");
        LocalDateTime initialDateJarek  = LocalDateTime.parse("1976-12-26T12:00:00");
        System.out.println(" Data urodzin : "+ initialDateJarek);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Wiek Jarka (period) : "+ Period.between(initialDateJarek.toLocalDate(), localDateTime.toLocalDate()));
        System.out.println("Wiek Jarka (duration) :"+ Duration.between(initialDateJarek.toLocalTime(), localDateTime.toLocalTime()));
        System.out.println(" Nazwa miesiąca : " + initialDateJarek.getMonth());
        System.out.println(" Nazwa dnia tygodnia :" + initialDateJarek.getDayOfWeek());
        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 5 ---------------------------------");
        System.out.println(" localDateTime : " + localDateTime);
        String zone0 = "Europe/Warsaw";
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of(zone0));
        String zone1 = "Europe/Paris";
        ZonedDateTime ZonedDateTime1 = ZonedDateTime.of(localDateTime, ZoneId.of(zone1));
        System.out.println(" localDateTime - " + zone1 + " : " + ZonedDateTime1);
        String zone2 = "Hongkong";
        ZonedDateTime ZonedDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of(zone2));
        System.out.println(" localDateTime - " + zone2 + " : " + ZonedDateTime2);
        System.out.println("" + zonedDateTime.withZoneSameInstant(ZoneId.of(zone2)));

        String zone3 = "America/New_York";
        ZonedDateTime ZonedDateTime3 = ZonedDateTime.of(localDateTime, ZoneId.of(zone3));
        System.out.println(" localDateTime - " + zone3 + " : " + ZonedDateTime3);
        System.out.println("" + zonedDateTime.withZoneSameInstant(ZoneId.of(zone3)));

        String zone4 = "Asia/Tokyo";
        ZonedDateTime ZonedDateTime4 = ZonedDateTime.of(localDateTime, ZoneId.of(zone4));
        System.out.println(" localDateTime - " + zone4 + " : " + ZonedDateTime4);
        System.out.println("" + zonedDateTime.withZoneSameInstant(ZoneId.of(zone4)));

        String zone5 = "US/Hawaii";
        ZonedDateTime ZonedDateTime5 = ZonedDateTime.of(localDateTime, ZoneId.of(zone5));
        System.out.println(" localDateTime - " + zone5 + " : " + ZonedDateTime5);
        System.out.println("" + zonedDateTime.withZoneSameInstant(ZoneId.of(zone5)));
        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 6 ---------------------------------");
        // Dla swojej daty urodzenia wyświetl ilość lat, miesięcy, dni i godzin,
        // które miały miejsce do obecnego momentu.
        // Następnie wypisz ile minut (całkowicie) i sekund (całkowicie) minęło od daty urodzenia.
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(" Teraz : "+ localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(1976,12,26,12,00);
        System.out.println(" Data urodzenia : " + localDateTime2);

        System.out.println(" różnica w latach : "+ChronoUnit.YEARS.between(localDateTime2,
                localDateTime1));
        System.out.println(" różnica w miesiącach : "+ChronoUnit.MONTHS.between(localDateTime2,
                localDateTime1));
        System.out.println(" różnica w dniach : "+ChronoUnit.DAYS.between(localDateTime2,
                localDateTime1));
        System.out.println(" różnica w godzinach : "+ChronoUnit.HOURS.between(localDateTime2,
                localDateTime1));
        System.out.println(" różnica w minutach : "+ChronoUnit.MINUTES.between(localDateTime2,
                localDateTime1));
        System.out.println(" różnica w sekundach : "+ChronoUnit.SECONDS.between(localDateTime2,
                localDateTime1));
        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 7 ---------------------------------");
        //Napisz program, który wyświetli dni tygodnia, w których obchodzić będziesz urodziny przez kolejne 10 lat.
        // localDateTime2 - czas i data urodzin
        System.out.println(" Dzień urodzin : " + localDateTime2 + " Dzień tygodnia : "+ localDateTime2.getDayOfWeek());
        System.out.println("Wiek Jarka (period) : "+ Period.between(initialDateJarek.toLocalDate(), localDateTime.toLocalDate()));
        int old = Period.between(localDateTime2.toLocalDate(), LocalDateTime.now().toLocalDate()).getYears();
        old++; // zwiększamy bo jeszcze nie skończone
        System.out.println(" Dzień urodzin w tym roku : " + localDateTime2.plusYears(old)+
                    " Dzień tygodnia : " + localDateTime2.plusYears(old).getDayOfWeek());
        for (int i = 0; i < 10; i++) {
            System.out.println(" Dzień urodzin w roku : " + localDateTime2.plusYears(old + i + 1)+
                    " Dzień tygodnia : " + localDateTime2.plusYears(old + i + 1).getDayOfWeek());

        }
        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 8 ---------------------------------");
        // Napisz metodę, która pobierze tablicę dat (LocalDate) i zwróci najnowszą datę.
        LocalDate[] localDates = new LocalDate[]{LocalDate.of(2001,04,21),
                                            LocalDate.of(2002, 4,8),
                                            LocalDate.of(2006, 5,8),
                                            LocalDate.of(1998, 12,12),
                                            LocalDate.of(2008, 6,7),
                                            LocalDate.of(2006,3,3)};
        showLocalDateArr(localDates);
        System.out.println(" Najnowsza data to : "+ getYoungestDate(localDates));

        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 9 ---------------------------------");
        // Napisz metodę, która pobierze tablicę dat i godzin (LocalDateTime) i zwróci najstarszą datę.
        LocalDateTime[] localDateTimes = new LocalDateTime[]{LocalDateTime.of(2001,04,21, 12, 00),
                LocalDateTime.of(2002, 4,8 ,12,0),
                LocalDateTime.of(2006, 5,8,12,0),
                LocalDateTime.of(1998, 12,12,12,0),
                LocalDateTime.of(2008, 6,7,12,0),
                LocalDateTime.of(2006,3,3,12,0),
                LocalDateTime.of(1998, 12,12,11,30)};
        showLocalDateTimeArr(localDateTimes);
        System.out.println(" Najstarsza data to : "+ getOldestDateTime(localDateTimes));

        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 10 ---------------------------------");
        // * Napisz metody, które przetransformują stary format Date na LocalDate i LocalDateTime.
        Date nowDate = new Date();
        System.out.println(" Data w klasie Date : " + nowDate);
        System.out.println(" Data w formacie LocalDate : " + dateToLocalDate(nowDate));
        System.out.println(" Data  i czas w formacie LocalDateTime : " + dateToLocalDateTime(nowDate));

        // ------------------------------------------------------------------------------------------------------
        System.out.println(" -------------------------------- ZADANIE 11 ---------------------------------");
        // * Napisz metody, które przetransformują stary format Date na LocalDate i LocalDateTime.
        // * Napisz metody, które przetransformują LocalDate i LocalDateTime na stary format Date.
        LocalDateTime localDateTime3 = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(1988,3,23);
        System.out.println(" LocalDateTime : "+ localDateTime3);
        System.out.println(" LocalDateTime w formacie Date : " + localDateTimeToDate(localDateTime3));
        System.out.println(" LocalDate : "+ localDate);
        System.out.println(" LocalDate  w formacie Date : " + localDateToDate(localDate));

    }
    // ---------------------------------------------------------------------------------------------------------
    // -------------------------------- metody realizujace zadania
    public static Date localDateToDate(LocalDate localDate){
        String string = localDate.toString();
//        System.out.println(string);
        String[] strings = string.split("T");
        String[] strData = strings[0].split("-");
//        String[] strTime = strings[1].split(":");

        Date date = new Date();
//        System.out.println(" Date : "+ date);
        date.setYear(Integer.parseInt(strData[0])-1900);// ustawienie roku
        date.setMonth(Integer.parseInt(strData[1])-1);// ustawienie miesiąca 0 -11
        date.setDate(Integer.parseInt(strData[2])); // dzien w miesiącu 1-31
//        date.setHours(Integer.parseInt(strTime[0]));
//        date.setMinutes(Integer.parseInt(strTime[1]));
//        int sec = Math.round(Float.parseFloat(strTime[2]));
//        date.setSeconds(sec);
//        System.out.println(date);
        return date;

    }
    public static Date localDateTimeToDate(LocalDateTime localDateTime){
        String string = localDateTime.toString();
//        System.out.println(string);
        String[] strings = string.split("T");
        String[] strData = strings[0].split("-");
        String[] strTime = strings[1].split(":");

        Date date = new Date();
//        System.out.println(" Date : "+ date);
        date.setYear(Integer.parseInt(strData[0])-1900);// ustawienie roku
        date.setMonth(Integer.parseInt(strData[1])-1);// ustawienie miesiąca 0 -11
        date.setDate(Integer.parseInt(strData[2])); // dzien w miesiącu 1-31
        date.setHours(Integer.parseInt(strTime[0]));
        date.setMinutes(Integer.parseInt(strTime[1]));
        int sec = Math.round(Float.parseFloat(strTime[2]));
        date.setSeconds(sec);
//        System.out.println(date);
        return date;

    }

    public static LocalDateTime dateToLocalDateTime(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateTimeString  = dateFormat.format(date).toString();
        String[] dateTimeStringArr = dateTimeString.split(" ");

        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStringArr[0]+"T"+dateTimeStringArr[1]);
        return localDateTime;

    }


    public static LocalDate dateToLocalDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateTimeString  = dateFormat.format(date).toString();
        String[] dateTimeStringArr = dateTimeString.split(" ");
//        String[] dateStringArr = dateTimeStringArr[0].split("-");
//        String[] timeStringArr = dateTimeStringArr[1].split(":");

////        //wypisanie daty
////        System.out.println("wypisanie daty - rok - mc - dzień");
////        for (String str:dateStringArr ) {
////            System.out.println(str);
////        }
//        //wypisanie czasu
//        System.out.println("wypisanie czasu - h, min, s, ms");
//        for (String str: timeStringArr) {
//            System.out.println(str);
//        }
        LocalDate localDate = LocalDate.parse(dateTimeStringArr[0]);
//        System.out.println(" local date");
//        System.out.println(localDate);
        return localDate;
    }

    public static void showLocalDateArr(LocalDate[] localDates){
        if(localDates == null) return;
        if(localDates.length == 0) return;
        for (int i = 0; i < localDates.length ; i++) {
            System.out.println(" Data nr "+ (i+1) + " : "+localDates[i]);
        }
    }
    public static LocalDate getYoungestDate(LocalDate[] localDates){
        if(localDates == null) return null;
        if(localDates.length == 0) return null;
        LocalDate tempLocalDate = localDates[0];
        if(localDates.length == 1) return tempLocalDate;
        for (int i = 1; i < localDates.length; i++) {
            if(localDates[i].isAfter(tempLocalDate))
                tempLocalDate = localDates[i];

        }
        return tempLocalDate;
    }
    public static void showLocalDateTimeArr(LocalDateTime[] localDateTimes){
        if(localDateTimes == null) return;
        if(localDateTimes.length == 0) return;
        for (int i = 0; i < localDateTimes.length ; i++) {
            System.out.println(" Data nr "+ (i+1) + " : "+localDateTimes[i]);
        }
    }
    public static LocalDateTime getOldestDateTime(LocalDateTime[] localDateTimes){
        if(localDateTimes == null) return null;
        if(localDateTimes.length == 0) return null;
        LocalDateTime tempLocalDateTime = localDateTimes[0];
        if(localDateTimes.length == 1) return tempLocalDateTime;
        for (int i = 1; i < localDateTimes.length; i++) {
            if(localDateTimes[i].isBefore(tempLocalDateTime))
                tempLocalDateTime = localDateTimes[i];

        }
        return tempLocalDateTime;
    }

}
