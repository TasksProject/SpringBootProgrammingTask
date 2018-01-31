package Aufgabe;

import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SystemInfo {

    private String currentTime;
    private String systemVersion;

    public SystemInfo() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        currentTime = sdf.format(cal.getTime());
        systemVersion = ManagementFactory.getRuntimeMXBean().getVmVersion();
    }

    public String getCurrentTime() {
        return currentTime;
    }

    //@JsonIgnore
    public String getSystemVersion() {
        return systemVersion;
    }
}

