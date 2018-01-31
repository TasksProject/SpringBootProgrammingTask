package Aufgabe;

import java.util.List;

public class Calculator {
    List<Operation> operations;
    public Calculator(List<Operation> operations) {
        this.operations=operations;
    }
    public List<Operation> getOperations() {
        return operations;
    }
}

