package Aufgabe;

/**
 * Die Klasse Multiplier berechnet die Multiplikation zweier Integer-Zahlen.
 * @author Maxime Tchangou
 * @version 1.0
 */
public class Multiplier {

    /**
     * Die beiden Integer-Zahlen, für die die Multiplikation berechnet werden soll.
     */
    private int a; // Erster Parameter
    private int b; // Zweiter Parameter
    private int result; //Ergebnis der Multiplikation von a mit b.

    /**
     * Konstruktor der Klasse Multiplier.
     * @param a Erster Parameter
     * @param b Zweiter Parameter
     * @param result Ergebnis der Multiplikation von a und b.
     */
    public Multiplier(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
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
        return result;
    }

}
