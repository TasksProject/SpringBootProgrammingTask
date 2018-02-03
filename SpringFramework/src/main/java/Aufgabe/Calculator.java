package Aufgabe;

import org.apache.log4j.Logger;

/**
 * Dies ist die Dokumentation der Klasse Calculator.
 * Calculator dient zur Berechnung einer Liste von verschiedenen Operationen: ADD, SUBTRACT, MULTIPLY oder DIVIDE.
 * @author Maxime Tchangou
 * @version 1.0
 * @see Operations
 * @see Operation
 */
public class Calculator {

    /**
     * Dieses Logger dient zum Schreiben auf der Console, falls ein Error geworfen werden sollte.
     * Zum Beispiel falls eine Eingabe von der Liste von Operationen syntatisch falsch ist.
     */
    private static final Logger log = Logger.getLogger(SystemInfoController.class);

    /**
     * Die Operationen, die berechnet werden sollen.
     */
    private Operations operations;  // Deklaration

    /**
     * Konstruktor für die Klasse Calculator.
     * Es berechnet das Ergebnis für jede Operation in der Liste von Operationen, die in Operations enthalten sind.
     * @param operations die zu berechnen Operationen
     */
    public Calculator(Operations operations) {
        Operation[] opAr = operations.getOperations();
        for (int i = 0; i < opAr.length; i++) {
            opAr[i] = calculateResult(opAr[i]);
        }
        this.operations = operations;
    }

    /**
     * Liefert die Operationen zurück.
     * @return  Alle Operationen mit ihrem Ergebnis.
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Diese Methode berechnet das Ergebnis einer Operation und liefert die Operation mit ihrem Ergebnis zurück.
     * @param operation Operation, für die das Ergebnis berechnet werden sollte.
     * @return Eine Operation mit dem Ergebnis der Berechnung.
     */
    public Operation calculateResult(Operation operation) {
        String operator = operation.getOp();
        switch (operator){
            case "ADD":
                operation.setResult(operation.getP1() + operation.getP2());
                break;
            case "MULTIPLY":
                operation.setResult(operation.getP1() * operation.getP2());
            break;
            case "SUBTRACT":
                operation.setResult(operation.getP1() - operation.getP2());
            break;
            case "DIVIDE":
                operation.setResult(operation.getP1() / operation.getP2());
            break;
            default:
                log.error("Something is wrong. Please check the structure of your operations.");
                break;
        }
        return operation;
    }
}

