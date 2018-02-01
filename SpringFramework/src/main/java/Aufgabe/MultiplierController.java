package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * Dies ist der Controller der Klasse Multiplier.
 * Wie die anderen Controller in diesem Projekt hilft er dabei, die Web-Anwendung im Browser anzuzeigen.
 * @author Maxime Tchangou
 * @version 1.0
 * @see CreateJSON Übersetzt Ihre Message in JSON.
 */
@RestController
public class MultiplierController {

    @RequestMapping(value = "GET/api/multiplier/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    /**
     * Diese Controller-Methode nimmt die beiden Path-Variablen und liefert das Ergebnis Ihrer Multiplikation zurück.
     * @param a Erster Parameter
     * @param b Zweiter Parameter
     * @return Eine Mutiplikation zweier Integer-Variablen
     * @see Multiplier
     */
    public Multiplier convertMultiplierToJson(@PathVariable String a, @PathVariable String b) {
        return new Multiplier(Integer.parseInt(a),Integer.parseInt(b));
    }
}

