package Simon;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        //Scanner Initialisieren
        @SuppressWarnings("resource") // Unterdrückt die Resource-Warnung
        Scanner scanner = new Scanner(System.in);
        
        //Kunden Datenbank initialisieren
        cKundenManagment management = new cKundenManagment();
        //Datenbank von File lesen
        management.ladenKunden();

        
        
        
        
        
        


        //Program start
        System.out.println("Wilkommen zum super automatischen Geldeingabeautomat");




        boolean exit = true;
    
        while (exit) { 

            //Hauptmenu
            switch (scanner.nextLine()) {
                case "Usermanagment" -> {

                    userInterface(management, scanner);
        

                }case "Währungsmanagment" -> {

        

                }case "Einzahlung" -> {

        

                }case "Quittung" -> {

        

                } case "exit" -> {

                    //Program beenden
                    exit = false;
        
                }                  
                   
            }  
        }
        

        
        
        
        
        
                
    }

            
    public static void userInterface(cKundenManagment management, Scanner scanner) {
         
        String Vornahme = "";
        String Nachnahme = "";
        int Age = 0;
        int KundenNr = 0;
        boolean Exit = true;
        
        System.out.println("Kundenverwaltung");
        System.out.println("Hier Können sie neue Kunden anlegen oder eine Liste aller Kunden ausgeben");
        System.out.println("Komandos");
        System.out.println("new  --> Neuer Kunde anlegen");
        System.out.println("show --> Liste aller Kunden ausgeben");
        System.out.println("load --> Liste von File einlesen");
        System.out.println("help --> Komandos anzeigen");
        System.out.println("exit --> Um wider zum Hauptmenu zu gelangen");
        
        while (Exit) { 

            switch (scanner.nextLine()) {
                case "new" -> {
                    
                    System.out.println("Wie ist Ihr Vorname");
                    Vornahme = scanner.nextLine();
    
                    System.out.println("Wie ist Ihr Nachname");
                    Nachnahme = scanner.nextLine();
    
                    System.out.println("Wie ist Ihr Alter");
                    Age = scanner.nextInt();
    
                    management.neuKunde(new cKunde(Vornahme, Nachnahme, Age, KundenNr++));
    
                    // Kunden speichern
                    management.speichernKunden();
    
                }
                case "show" -> {
                    //Kunden anzeigen
                    management.anzeigenKunden();
    
                }
                case "load" -> {
                    // Kunden laden und anzeigen
                    management.ladenKunden();
                    management.anzeigenKunden();
    
                }
                case "help" -> {
                    System.out.println("Komandos");
                    System.out.println("new  --> Neuer Kunde anlegen");
                    System.out.println("show --> Liste aller Kunden ausgeben");
                    System.out.println("load --> Liste von File einlesen");
                    System.out.println("help --> Komandos anzeigen");
                    System.out.println("exit --> Um wider zum Hauptmenu zu gelangen");
    
                }
                case "exit" -> {
                    // Zum hauptmenu
                    // Kunden speichern
                    management.speichernKunden();

                    Exit = false;
            
                }
    
            }

        }
        
    }
    }