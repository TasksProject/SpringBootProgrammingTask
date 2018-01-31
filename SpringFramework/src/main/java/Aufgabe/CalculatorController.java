package Aufgabe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CalculatorController {

    @RequestMapping(value = "POST/api/calculator", method = RequestMethod.GET)
    @ResponseBody
    public String displayAPICalculator(){
        Operation op1 = new Operation(12,45, "ADD");
        Operation op2 = new Operation(12, 45, "MULTIPLY");
        Operation op3 = new Operation(45,3, "DIVIDE");
        Operation op4 = new Operation(34,52, "SUBTRACT");
        List<Operation> operationList = Arrays.asList(op1, op2, op3, op4);
        Calculator calculator = new Calculator(operationList);
        return CreateJSON.convertObjectToJSON(calculator);
    }
}