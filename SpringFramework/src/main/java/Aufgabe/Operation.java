package Aufgabe;

/**
 * Dies ist die Dokumentation der Klasse Operation.
 * Eine Operation enthält zwei Operaden, einen Operator und das Ergebnis, das am Ende der Operation
 * zurückgeliefert werden soll.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Operation {
    int p1; // Erster Operand
    int p2; // Zweiter Operand
    String op; // der Operator
    int result; // Das Ergebnis der Operation

    /**
     * Konstruktor der Klasse Operation.
     * @param firstOperand Erster Operand der Operation
     * @param secondOperand  Zweiter Operand der Operation
     * @param operator Operator der Operation
     */
    public Operation(int firstOperand, int secondOperand, String operator) {
        this.p1=firstOperand;
        this.p2=secondOperand;
        this.op=operator;
    }

    /**
     * Liefert den ersten Operand zurück.
     * @return // Erster Operand
     */
    public int getP1() {
        return p1;
    }

    /**
     * Gibt den zweiten Operand einer Operation zurück.
     * @return // Zweiter Operand
     */
    public int getP2() {
        return p2;
    }

    /**
     * Gibt den Operator einer Operation zurück.
     * @return
     */
    public String getOp() {
        return op;
    }

    /**
     * Liefert das Ergebnis der Operation zurück.
     * @return // Ergebnis der Operation
     */
    public int getResult() {
        calculateResult(this);
        return result;
    }

    /**
     * Diese Methode berechnet das Ergebnis einer Operation und setzt das Ergebnis als result.
     * @param operation Die Operation, die wir berechnen wollen.
     */
    public void calculateResult(Operation operation) {
        String operator = operation.getOp();
        switch (operator){
            case "ADD":
                result = operation.getP1() + operation.getP2();
                break;
            case "MULTIPLY":
                result = operation.getP1() * operation.getP2();
                break;
            case "SUBTRACT":
                result = operation.getP1() - operation.getP2();
                break;
            case "DIVIDE":
                result = operation.getP1() / operation.getP2();
                break;
            default:
                System.out.println("Something is wrong. Please check the structure of your operations.");
                break;
        }
    }
}
