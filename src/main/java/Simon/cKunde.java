package Simon;


public class cKunde {
    
    int Id = 0;
    String Vornahme = "";
    String Nachnahme = "";
    int Age = 0;
    int KundenNr = 1;
  


    //Methode zum Beschreiben
    public cKunde(String Vornahme,String Nachnahme,int Age, int KundenNr) {
        
        this.Vornahme = Vornahme;
        this.Nachnahme = Nachnahme;
        this.Age = Age;

    }


    // Getter und Setter
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
        
        return Id +  Vornahme + " " + Nachnahme + "\t\t" + Age + "\t\t" + KundenNr;

    }


}
