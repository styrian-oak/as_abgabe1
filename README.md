# as_abgabe1
Dieses Textanalyse-Tool ist meine 1. AS-Abgabe zum Thema Enterprise Programming

## Features des Programms
- analysiert Textdateien statistisch
- User wird beim Start nach Dateinamen gefragt
- es können nicht nur ganze Texte, sondern auch *nur ausgewählte Zeilen* analysiert werden
    - ausgewählten Text kann man z.B. über `Set<String>` umsetzen
    - User kann Ranges von Zeilen als Auswahl eingeben (z.B. 1-100, 150-190)
    - es können auch alle Textzeilen ausgewählt werden, in denen bestimmter String vorkommt
    - mehrere Auswahloperationen hintereinander mögl. (z.B. alle Zeilen von 500 bis 599 & Zeilen, in denen das Wort "whale" vorkommt)
        - dabei soll 1 Zeile aber max. 1 mal in der Auswahl sein
- Auswahl kann zurückgesetzt/gelöscht werden
- ausgewählter Text kann normalisiert werden (alles kleingeschrieben & Sonderzeichen entfernt)
- es kann gezählt werden, wie oft bestimmter Begriff im Text vorkommt
- häufigste Wörter können ausgegeben werden
- es kann ausgegeben werden, welches Wort am häufigsten auf ein anderes folgt

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
