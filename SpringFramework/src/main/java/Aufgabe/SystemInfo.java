package Aufgabe;

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
     * @param currentTime aktuelle Uhrzeit.
     * @param systemVersion Version von Ihrem System.
     */
    public SystemInfo(String currentTime, String systemVersion) {
        this.currentTime = currentTime;
        this.systemVersion = systemVersion;
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

