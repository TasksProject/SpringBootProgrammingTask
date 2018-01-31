package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * The controller of the class Message
 */
@RestController
public class MessageController {

    @RequestMapping(value = "GET/api/echo", params = {"message"},method = RequestMethod.GET)
    public String convertMessageToJson(@RequestParam("message") String message) {
        message = CreateJSON.convertObjectToJSON(new Message(message));
        return message;
    }
}