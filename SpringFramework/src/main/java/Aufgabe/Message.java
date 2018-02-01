package Aufgabe;

/**
 * Die Klasse dient zur Erstellung von der Nachricht oder von dem Text.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Message {
    /**
     * Die aktuelle Nachricht als String.
     *
     * @since 1.0
     */
    private String message; //Deklaration

    /**
     * Kontruktor der Klasse Message
     * @param yourMessage der Text oder die Nachricht, der oder die in der Web-Anwendung angezeigt werden soll.
     */
    public Message(String yourMessage) {
        this.message = yourMessage;
    }

    /**
     * Gibt die Nachricht bzw. den Text zurück.
     * @return Message
     */
    public String getMessage() {
        return message;
    }
}

