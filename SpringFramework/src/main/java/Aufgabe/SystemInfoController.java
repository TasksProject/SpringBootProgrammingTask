package Aufgabe;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Die Klasse SystemInfoController ist der Controller der Klasse SystemInfo.
 * Sie dient zur Anzeige der SystemInfo in der Web-Anwendung.
 * @author Maxime Tchangou
 * @version 1.0
 * @see SystemInfo
 */
@RestController
public class SystemInfoController {

    /**
     * Dieses Logger dient zum Schreiben auf der Console. In diesem Fall wird die aktuelle Uhrzeit Ihres Systems.
     */
    private static final Logger log = Logger.getLogger(SystemInfoController.class);

    /**
     * Diese Methode gibt die aktuelle Uhrzeit und die Version Ihres Systems als JSON zurück.
     * @return SystemInfo: aktuelle Uhrzeit und Ihre Systemversion als JSON.
     */
    @GetMapping("/api/systeminfo")
    public SystemInfo getSystemInfo() {
        /**
         * Aus den Klassen Calendar und SimpleDateFormat werden die aktuelle Uhrzeit und die Version von Ihrem System aufgerufen.
         */
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        log.info( sdf.format(cal.getTime()) );

        String currentTime = sdf.format(cal.getTime());
        String systemVersion = ManagementFactory.getRuntimeMXBean().getVmVersion();
        return new SystemInfo(currentTime, systemVersion);
    }
}