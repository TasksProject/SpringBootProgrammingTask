package Aufgabe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sie ist die Main-Klasse zum starten der Spring Application.
 * Sie dient zum Starten der Web-Anwendung.
 * @author Maxime Tchangou
 * @version 1.0
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
