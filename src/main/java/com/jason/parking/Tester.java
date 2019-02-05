package com.jason.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
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

        //-----------------Calendar 日曆類別(時間運算) -------
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9); // 9為index 0為一月
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);//往後加3天
        System.out.println(calendar.getTime());
    }
}
