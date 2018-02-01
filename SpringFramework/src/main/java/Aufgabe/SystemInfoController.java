package Aufgabe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Die Klasse SystemInfoController ist der Controller der Klasse SystemInfo.
 * Sie dient zur Anzeige der SystemInfo in der Web-Anwendung.
 * @author Maxime Tchangou
 * @version 1.0
 * @see SystemInfo
 */
@RestController
public class SystemInfoController {

    @RequestMapping(value = "GET/api/systemInfo", method = RequestMethod.GET)
    public SystemInfo convertSystemInfoToJson() {
        return new SystemInfo();
    }
}
