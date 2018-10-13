package com.admaroc.tecdoc.Utils;

import org.joda.time.MutableDateTime;

public class Configuration {

    public String ftpAddress;
    public int maxLoginAttempts;
    public MutableDateTime min=new MutableDateTime();
    public MutableDateTime  max=new MutableDateTime();

    private static Configuration ourInstance = new Configuration();

    public static Configuration getInstance() {
        return ourInstance;
    }

    private Configuration() {
        //min = new DateTime();
       // max = new DateTime();
        min.hourOfDay().set(9);
        min.minuteOfHour().set(45);
        max.hourOfDay().set(17);
        max.minuteOfHour().set(30);
    }
}
