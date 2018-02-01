package Aufgabe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Dies ist die Dokumentation der Klasse CalculatorController.
 * CalculatorController dient zur Anzeige der Anfrage in dem Browser.
 * Die Anfrage ist in diesem Fall die Liste der Operationen, die berechnet werden sollen.
 * Am Ende werden die Operationen mit ihren Ergebnissen als JSON angezeigt.
 * @author Maxime Tchangou
 * @see Calculator
 * @see CreateJSON
 */
@RestController
public class CalculatorController {

    /**
     * Diese Methode liefert die in der Liste von Operationen enthaltene Operation
     * mit ihrem Ergebnis als JSON zurück.
     */
    @RequestMapping(value = "POST/api/calculator", method = RequestMethod.GET) //Link zum Starten des HTTP-Request
    @ResponseBody
    public String displayAPICalculator(){
        //  Wir erstellen erstmal einige Beispiele von Operationen.
        Operation op1 = new Operation(12,45, "ADD");
        Operation op2 = new Operation(12, 45, "MULTIPLY");
        Operation op3 = new Operation(45,3, "DIVIDE");
        Operation op4 = new Operation(34,52, "SUBTRACT");
        Operation op5 = new Operation(100,243, "ADD");
        // Wir erstellen die Liste von Operationen, in dem wir die erstellten Operationen in die Operation-Liste einfügen
        List<Operation> operationList = Arrays.asList(op1, op2, op3, op4, op5);
        Calculator calculator = new Calculator(operationList);
        return CreateJSON.convertObjectToJSON(calculator);
    }
}