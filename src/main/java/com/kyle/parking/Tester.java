package com.kyle.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
    LocalDateTime enter =
            LocalDateTime.of(2021,7,15,17,28,20);
    LocalDateTime leave =
            LocalDateTime.of(2021,7,15,19,38,20);
    Car car=new Car("AAA-0012",enter);
    car.setLeave(leave);
    long price = (long) Math.ceil((car.getDuration()/60)*500);
        System.out.println("parking price is: "+price);


//        java8();
//        java();
    }

    private static void java8() {
        Instant instant =Instant.now();
        System.out.println(instant);
//        local
        LocalDateTime now =LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(now));
        System.out.println(dtf.format(now.plus(Duration.ofMinutes(10))));
        LocalDateTime other =LocalDateTime.of(2018,8,25 ,15,10,15);
        System.out.println(other);
    }

    private static void java() {
        Date date= new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new
                SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s ="2021/07/18 15:32:21";
        try {
            Date otherdate =sdf.parse(s);
            System.out.println(otherdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal= Calendar.getInstance();    //取Calender類別
        System.out.println(cal.getTime());
        cal.set(Calendar.MONTH,7);
        System.out.println(cal.getTime());
        cal.add(Calendar.SECOND,25);
        System.out.println(cal.getTime());
    }
}
