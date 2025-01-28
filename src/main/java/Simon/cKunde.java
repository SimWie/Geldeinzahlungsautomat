package Simon;


public class cKunde {
    
    String Vornahme = "";
    String Nachnahme = "";
    int Age = 0;
    int KundenNr = 1;
  


    //Methode zum Beschreiben
    public cKunde(String Vornahme,String Nachnahme,int Age, int KundenNr) {
        
        this.Vornahme = Vornahme;
        this.Nachnahme = Nachnahme;
        this.Age = Age;
        this.KundenNr = KundenNr++;

    }


    // Getter und Setter
    public int getKundenNr() {
        return KundenNr;
    }

    public void setKundenNr(int KundenNr) {
        this.KundenNr = KundenNr;
    }


    public String getVornahme() {
        return Vornahme;
    }

    public void setVornahme(String Vornahme) {
        this.Vornahme = Vornahme;
    }


    public String getNachnahme() {
        return Nachnahme;
    }

    public void setNachnahme(String Nachnahme) {
        this.Nachnahme = Nachnahme;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }




    
    //Methode zum schreiben
    @Override
    public String toString() {
        
        return KundenNr + "\t" + Vornahme + " " + Nachnahme + "\t\t\t" + Age;

    }


}
