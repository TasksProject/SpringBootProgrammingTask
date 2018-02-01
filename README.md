# SpringBootProgrammingTask

Dieses Projekt ermöglicht die Erstellung einer kleinen Web-Anwendung mit Java, Spring-Boot und Maven, welche folgende HTTP (Rest) Endpunkte anbietet:

##### 1. GET /api/systemInfo
	- Output: JSON Antwort mit aktuelle Uhrzeit und version des Software (version kann ein belibiges Zeichenfolge sein)
##### 2. GET /api/echo?message=<any text message>
	- Input: Query parameter 'message' als Strung
	- Output: JSON Antwort mit eingegebene 'message' Wert

##### 3. GET /api/multiplier/{a}/{b}
	- Input: integer a, integer b als path parameter
	- Output: JSON Antwort mit dem Ergebnis von a*b

##### 4. POST /api/calculator
	- Input: JSON Body mit eine Liste von Operationen jeweils 2 operanden(p1 und p2) und 1 operator (op). Als Operator kann ADD, MULTIPLY, SUBTRACT oder DIVIDE vorkommen. Die Parameter (p1 und p2) dürfen Ganze- oder Kommazahl werden. Siehe Beispiel unten:
	{
		"operations": [
			{"p1" : 34, 
			"p2" : 52,
			"op" : "MULTIPLY"},
			{"p1" : 100, 
			"p2" : 243,
			"op" : "ADD"},
			{"p1" : 34, 
			"p2" : 52,
			"op" : "SUBTRACT"}
			]
	}
	- Output: JSON Antwort mit der gleichen Form wie Input aber beinhaltet jeweils ein Ergebnis. Siehe Beispiel unten:
	{
		"operations": [
			{"p1" : 3, 
			"p2" : 5.2,
			"op" : "MULTIPLY",
			"result": 15.6},
			{"p1" : 100, 
			"p2" : 243,
			"op" : "ADD",
			"result": 343},
			{"p1" : 34, 
			"p2" : 52,
			"op" : "SUBTRACT",
			"result": -18}
			]
	}

##### Schritte zum Starten des Projekts:
##### 1. git project clonen in Ihrem SmartGit oder SourceTree.
##### 2. Projekt mit IntelliJ starten und build Project
##### 3. Eine der Main-Klassen ausführen: CalculatorMain, MessageMain, MultiplierMain oder SystemInfoMain
##### 4. In Ihrem Browser folgenden Link eingeben zum Starten der HTTP-Anfragen:
		- localhost:8181/GET/api/systeminfo
		- localhost:8181/GET/api/echo?message=WriteYourMessageHere
		- localhost:8181/GET/api/multiplier/first/second  -----> zB: localhost:8181/GET/api/multiplier/5/5
		- localhost:8181/POST/api/calculator
