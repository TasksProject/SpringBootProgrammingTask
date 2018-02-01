package Aufgabe;

import java.util.List;

/**
 * Dies ist die Dokumentation der Klasse Calculator.
 * Calculator dient zur Berechnung einer Liste von verschiedenen Operationen: ADD, SUBTRACT, MULTIPLY oder DIVIDE.
 * @author Maxime Tchangou
 * @version 1.0
 * @see Operation
 */
public class Calculator {

    /**
     * Die aktuelle Liste von Operationen, die berechnet werden sollen.
     */
    private List<Operation> operations;  // Deklaration

    /**
     * Konstruktor für die Klasse Calculator
     * @param operations die Liste von Operationen
     */
    public Calculator(List<Operation> operations) {
        this.operations = operations;
    }

    /**
     * Liefert die Liste von Operationen zurück.
     * @return  Liste von Operationen
     */
    public List<Operation> getOperations() {
        return operations;
    }
}

