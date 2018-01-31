package Aufgabe;

public class Operation {
    int p1;
    int p2;
    String op;
    int result;

    public Operation(int firstOperand, int secondOperand, String operator) {
        this.p1=firstOperand;
        this.p2=secondOperand;
        this.op=operator;
    }

    public int getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public String getOp() {
        return op;
    }

    public int getResult() {
        result = calculateResult(this);
        return result;
    }

    public int calculateResult(Operation operation) {
        int resultCalculate = 0;
        String operator = operation.getOp();
        switch (operator){
            case "ADD":
                resultCalculate = operation.getP1() + operation.getP2();
                break;
            case "MULTIPLY":
                resultCalculate = operation.getP1() * operation.getP2();
                break;
            case "SUBTRACT":
                resultCalculate = operation.getP1() - operation.getP2();
                break;
            case "DIVIDE":
                resultCalculate = operation.getP1() / operation.getP2();
                break;
            default:
                System.out.println("No operator");
        }
        return resultCalculate;
    }
}
