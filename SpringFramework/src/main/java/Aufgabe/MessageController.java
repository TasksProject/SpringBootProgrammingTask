package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * Dies ist der Controller der Klasse Message.
 * Wie die anderen Controller in diesem Projekt hilft er dabei, die Web-Anwendung im Browser anzuzeigen.
 * @author Maxime Tchangou
 * @version 1.0
 * @see Message
 */
@RestController
public class MessageController {

    /**
     * Diese Methode nimmt Ihre Nachricht und gibt sie als JSON züruck. Also sie übersetzt Ihre Message in JSON.
     * @param message Die Nachricht, die als JSON zurückgegeben werden soll.
     * @return Ihre Nachricht oder Ihr Text als JSON im Browser.
     */
    @RequestMapping(value = "/api/echo", params = {"message"}, method = RequestMethod.GET)
    public Message getMessage(@RequestParam("message") String message) {
        return new Message(message);
    }
}