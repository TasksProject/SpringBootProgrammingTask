package Aufgabe;

import org.springframework.web.bind.annotation.*;

@RestController
public class MultiplierController {

    @RequestMapping(value = "GET/api/multiplier/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public Multiplier convertMultiplierToJson(@PathVariable String a, @PathVariable String b) {
        return new Multiplier(Integer.parseInt(a),Integer.parseInt(b));
    }
}

