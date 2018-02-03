package Aufgabe;

/**
 * Dies ist die Dokumentation der Klasse Operations. Sie dient zur Erstellung einer Liste von Operationen.
 * Diese Klasse wird angewendet, damit der String "operations, der in Inputs und Outputs von Calculator enthalten ist,
 * in JSON angezeigt werden kann.
 * @author Maxime Tchangou
 * @version 1.0
 * @see Operation
 */
public class Operations {

    /**
     * Liste von Operationen, für die ein Ergebnis berechnet werden soll.
     */
    private Operation[] operations;

    /**
     * Liefert die Liste oder das Array von Operationen mit dem Ergebnis jeder in der Liste bzw. im Array enthaltenen Operation.
     * @return Operationen mit ihrem Ergebnis.
     */
    public Operation[] getOperations() {
        return operations;
    }

    /**
     * Setzt die Liste von Operationen.
     * @param operations Liste von in dem Input JSON enthaltenen Operationen mit ihrem Ergebnis.
     */
    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }
}
