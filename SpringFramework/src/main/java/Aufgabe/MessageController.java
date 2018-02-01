package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * Dies ist der Controller der Klasse Message.
 * Wie die anderen Controller in diesem Projekt hilft er dabei, die Web-Anwendung im Browser anzuzeigen.
 * @author Maxime Tchangou
 * @version 1.0
 * @see CreateJSON Übersetzt Ihre Message in JSON.
 */
@RestController
public class MessageController {

    /**
     * Diese Methode nimmt Ihre Nachricht und gibt sie als JSON züruck. Also sie übersetzt Ihre Message in JSON.
     * Dafür wird die Methode (convertObjectToJSON) der Klasse CreateJSON aufgerufen.
     * @param message
     * @return Ihre Nachricht oder Ihr Text als JSON im Browser.
     */
    @RequestMapping(value = "GET/api/echo", params = {"message"},method = RequestMethod.GET)
    public String convertMessageToJson(@RequestParam("message") String message) {
        message = CreateJSON.convertObjectToJSON(new Message(message));
        return message;
    }
}