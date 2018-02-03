package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * Dies ist der Controller der Klasse Multiplier.
 * Wie die anderen Controller in diesem Projekt hilft er dabei, die Web-Anwendung im Browser anzuzeigen.
 * @author Maxime Tchangou
 * @version 1.0
 * @see Multiplier
 */
@RestController
public class MultiplierController {

    /**
     * Diese Controller-Methode nimmt die beiden Path-Variablen und liefert das Ergebnis ihrer Multiplikation zurück.
     * @param a Erster Parameter
     * @param b Zweiter Parameter
     * @return Eine Mutiplikation zweier Integer-Variablen
     * @see Multiplier
     */
    @GetMapping("/api/multiplier/{a}/{b}")
    public Multiplier getMultiplierResult(@PathVariable String a, @PathVariable String b) {
        int aInt = Integer.parseInt(a); // Cast den String a in Integer
        int bInt = Integer.parseInt(b); // Cast den String b in Integer
        int result = aInt * bInt; // Berechnet die Multiplikation beider Zahlen
        return new Multiplier(aInt, bInt, result);
    }
}

