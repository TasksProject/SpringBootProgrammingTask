package Aufgabe;

import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Diese Klasse SystemInfo ruft die aktuelle Uhrzeit und die Version Ihrer Software auf.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class SystemInfo {

    /**
     * Die aktuelle Uhrzeit und die Version Ihres Systems.
     */
    private String currentTime;
    private String systemVersion;

    /**
     * Konstruktor der Klasse SystemInfo.
     * Dieses Konstuktor kümmert sich darum, aus den Klassen Calendar und SimpleDateFormat die aktuelle Uhrzeit
     * und die Version von Ihrem System aufzurufen.
     */
    public SystemInfo() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        currentTime = sdf.format(cal.getTime());
        systemVersion = ManagementFactory.getRuntimeMXBean().getVmVersion();
    }

    /**
     * Gibt die aktuelle Uhrzeit zurück.
     * @return aktuelle Uhrzeit
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Gibt die Systemversion zurück.
     * @return Systemversion
     */
    public String getSystemVersion() {
        return systemVersion;
    }
}

