package com.jason.parking;

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
        //java8();
        //java();
    }

    private static void java8() {
        //java8 新的時間類別 為Immutable物件
        Instant instant = Instant.now(); // 現在時間 時區為格林威治標準時間 T為Time Z為Zone
        System.out.println(instant);
        //Local 沒有要用到國際時區時可用
        LocalDateTime now = LocalDateTime.now(); //本地當下時間
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //定義格式
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3))); // 增加3小時的區間，不改變now本身，產生新的物件
        LocalDateTime other = LocalDateTime.of(2019,11,23,8,00,00);//新增一個自訂的時間物件
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date(); // 目前當下的時間 Date 內部使用long存 從1970/1/1 00:00:00 到現在的毫秒數
        System.out.println(date);
        System.out.println(date.getTime()); // 印出long 的 毫秒數
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //建構子的參數可以參考JAVA API
        System.out.println(sdf.format(date)); //將Date使用SimpleDateFormat轉換格式印出來

        //---------------- 字串轉Date ----------
        String s = "2019/02/06 08:00:00";
        try {
            Date other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //-----------------Calendar 日曆類別(時間運算) ------- 此為Mutable物件
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9); // 9為index 0為一月
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);//往後加3天
        System.out.println(calendar.getTime());
    }
}
