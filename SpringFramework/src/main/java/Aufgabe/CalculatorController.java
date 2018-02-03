package Aufgabe;

import org.springframework.web.bind.annotation.*;

/**
 * Dies ist die Dokumentation der Klasse CalculatorController.
 * CalculatorController dient zur Anzeige der Anfrage in dem Browser.
 * Die Anfrage ist in diesem Fall die Liste der Operationen, die berechnet werden sollen.
 * Am Ende werden die Operationen mit ihren Ergebnissen als JSON angezeigt.
 * @author Maxime Tchangou
 * @see Calculator
 * @see Operations
 */
@RestController
public class CalculatorController {

    /**
     * Es wird zurückgeliefert, falls die Applikation im Browser gestartet wird.
     * Dieses Controller wird mit Postman getestet.
     * @return Ein String für den Fehler.
     */
    @GetMapping("/api/calculator") //Link zum Starten des HTTP-Request
    public String getNotSupportedMessage(){
        return "GET is not supported!";
    }

    /**
     * Diese Methode liefert die in der Liste von Operationen enthaltenen Operationen mit ihrem Ergebnis als JSON zurück.
     * @param operations Die Operationen als JSON, für die das Ergebnis zu berechnen ist.
     * @return Die Operationen mit ihren Ergebnissen als JSON.
     */
    @PostMapping("/api/calculator") //Link zum Starten des HTTP-Request
    public Operations calculateOperations(@RequestBody Operations operations){
        return new Calculator(operations).getOperations();
    }
}