package Simon;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class cKundenManagment {

    

        private static final String FILE_NAME = "Kunden.json";
        private List<cKunde> kunden = new ArrayList<>();
        private Gson gson = new Gson();
    
        // Kunden hinzufügen
        public void neuKunde(cKunde kunde) {
            kunden.add(kunde);

        }
    
        // Kunden speichern (JSON)
        public void speichernKunden() {
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                gson.toJson(kunden, writer);
            
            } catch (Exception e) {
                System.err.println("Fehler beim Speichern: " + e.getMessage());
            }
        }
    
        // Kunden laden (JSON)
        public void ladenKunden() {
            try (FileReader reader = new FileReader(FILE_NAME)) {
                Type listType = new TypeToken<List<cKunde>>() {}.getType();
                kunden = gson.fromJson(reader, listType);
            
            } catch (Exception e) {
                System.err.println("Fehler beim Laden: " + e.getMessage());
            }
        }
    
        // Kunden anzeigen
        public void anzeigenKunden() {
            kunden.forEach(System.out::println);
        }
    
        public int getLastCustomerId() {
                   
            if (kunden == null || kunden.isEmpty()) {
                return 0; // Falls keine Kunden vorhanden sind
            }
            // Letztes Element der Liste abrufen
            return kunden.get(kunden.size()-1).getKundenNr();
        }
    }