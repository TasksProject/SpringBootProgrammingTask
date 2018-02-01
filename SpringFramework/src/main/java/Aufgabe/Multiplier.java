package Aufgabe;

/**
 * Die Klasse Multiplier berechnet die Multiplikation zweier Integer-Zahlen.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Multiplier {

    /**
     * Die zwei Zahlen, für die die Multiplikation berechnet werden soll.
     */
    private int a; // Erster Parameter
    private int b; // Zweiter Parameter
    private int result; //Ergebnis der Multiplikation von a mit b.

    /**
     * Konstruktor der Klasse Multiplier.
     * @param firstParameter Erster Parameter
     * @param secondParameter Zweiter Parameter
     */
    public Multiplier(int firstParameter, int secondParameter) {
        this.a = firstParameter;
        this.b = secondParameter;
    }

    /**
     * Liefert den ersten Parameter zurück.
     * @return Erster Integer-Parameter.
     */
    public int getA() {
        return a;
    }

    /**
     * Liefert den zweiten Parameter zurück.
     * @return Zweiter Integer-Parameter.
     */
    public int getB() {
        return b;
    }

    /**
     * Liefert das Ergebnis der Multiplikation zurück.
     * @return Ergebnis der Multiplikation.
     */
    public int getResult() {
        doMultiplication(a,b);
        return result;
    }

    /**
     * Diese Methode berechnet die Multiplikation der Parameter a und b und setzt das Ergebnis in result.
     * @param a Der erste Parameter der Multiplikation.
     * @param b Der zweite Parameter der Multiplikation.
     */
    public void doMultiplication(int a, int b) {
        result = a * b;
    }
}
