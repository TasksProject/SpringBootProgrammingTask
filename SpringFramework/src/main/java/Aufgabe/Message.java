package Aufgabe;

/**
 * Die Klasse dient zur Erstellung von der Nachricht oder von dem Text.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Message {
    /**
     * Die aktuelle Nachricht als String.
     * @since 1.0
     */
    private String message; //Deklaration

    /**
     * Konstruktor der Klasse Message. Dabei wird nur das Message gesetzt.
     * @param message der Text oder die Nachricht, der oder die in der Web-Anwendung angezeigt werden soll.
     */
    public Message(String message) {
        this.message = message;
    }

    /**
     * Gibt die Nachricht bzw. den Text zurück.
     * @return Das Message bzw. die Nachricht als String zurück.
     */
    public String getMessage() {
        return message;
    }
}

