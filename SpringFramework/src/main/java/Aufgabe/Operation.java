package Aufgabe;

/**
 * Dies ist die Dokumentation der Klasse Operation.
 * Eine Operation enthält zwei Operaden, einen Operator und das Ergebnis, das am Ende der Operation zurückgeliefert werden soll.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Operation {

    /**
     * Alle Elemente, die eine Operation enthält.
     */
    private double p1; // Erster Operand
    private double p2; // Zweiter Operand
    private String op; // der Operator
    private double result; // Das Ergebnis der Operation

    /**
     * Leeres Konstruktor für die Klasse Operation.
     */
    public Operation() {
    }

    /**
     * Konstruktor für die Klasse Operation mit enthaltenen Parametern.
     * @param p1 Erster Parameter
     * @param p2 Zweiter Parameter
     * @param op Operator der Berechnung
     * @param result Ergebnis der Berechnung
     */
    public Operation(double p1, double p2, String op, double result) {
        this.p1 = p1;
        this.p2 = p2;
        this.op = op;
        this.result = result;
    }

    /**
     * Liefert den ersten Operand einer Operation zurück.
     * @return  Erster Operand
     */
    public double getP1() {
        return p1;
    }

    /**
     * Setzt den ersten Operand.
     * @param p1 Erster Operand der Operation.
     */
    public void setP1(double p1) {
        this.p1 = p1;
    }

    /**
     * Gibt den zweiten Operand einer Operation zurück.
     * @return  Zweiter Operand
     */
    public double getP2() {
        return p2;
    }

    /**
     * Setzt den zweiten Operand.
     * @param p2 Zweiter Operand der Operation.
     */
    public void setP2(double p2) {
        this.p2 = p2;
    }

    /**
     * Gibt den Operator einer Operation zurück.
     * @return Der Operator (ADD, SUBTRACT, MULTIPLY oder DIVIDE) der Operation
     */
    public String getOp() {
        return op;
    }

    /**
     * Setzt den Operator der Operation.
     * @param op Operator der Operation.
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * Liefert das Ergebnis der Operation zurück.
     * @return  Ergebnis der Operation
     */
    public double getResult() {
        return result;
    }

    /**
     * Setzt das Ergebnis der Berechnung der Operation.
     * @param result Ergebnis der Berechnung der Operation.
     */
    public void setResult(double result) {
        this.result = result;
    }
}
