# as_abgabe1
Dieses Textanalyse-Tool ist meine 1. AS-Abgabe zum Thema Enterprise Programming

## Anforderungen
Folgendes muss umgesetzt und dokumentiert sein:
- Benutzeroberfläche, bei der man mehrere Operationen auswählen kann
- mehr als 1 Programmfluss
- nach Operation wird wieder Hauptmenü angezeigt (Operationen auswählen)
- User wird in mehreren Operationen nach Input gefragt,
- ...der gespeichert wird
- ...& späteren Verlauf des Programms beeinflusst

### technische Umsetzung
- **Maven** mit mind. 1 externen Bibliothek
    - s. 1. Tutoriumsblatt
- `pom.xml` erhält sinnvolle Werte
- **JUnit** für Unit-Tests
- Testabdeckung in Dokumentation angegeben
    - IntelliJ zeigt das an
- bei mind. 1 Methode mit Unit-Tests Standard- & Grenzfälle abgedeckt
- autom. Codegenerierung mit **Lombok** überall, wo mögl.
- Interaktion mit User über `System.out.println` oder `IO.println`
- Logging: zur Fehlerbehandlung hilfreiche Informationen auf Konsole ausgeben
- Logger von **Lombok** erstellen lassen
    - zeigen, dass man Unterschied zw. User- & Logging-Output versteht
