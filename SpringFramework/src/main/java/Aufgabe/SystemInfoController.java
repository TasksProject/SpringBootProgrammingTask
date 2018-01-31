package Aufgabe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemInfoController {

    @RequestMapping(value = "GET/api/systemInfo", method = RequestMethod.GET)
    public SystemInfo convertSystemInfoToJson() {
        return new SystemInfo();
    }
}
