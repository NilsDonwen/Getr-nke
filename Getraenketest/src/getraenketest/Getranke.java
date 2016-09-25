package getraenketest;


public class Getranke {
    
    
    String getraenk;            // Hier sind die Attribute
    double menge;
    double kalorien = 123;

    
public Getranke(){          // Konstruktor
    
    getraenk ="";
    menge = 0;
    kalorien = 0;
}   

public Getranke(String name, int milliliter, int kcal){         // weitere Konstruktor
    getraenk = name;
    this.menge = menge;     // sonst 3x das gleiche
    this.kalorien = kalorien;
}

   

    public String getGetraenk() {
        return getraenk;
    }

    public double getMenge() {
        return menge;
    }

    public double getKalorien() {
        return kalorien;
    }

    public void setGetraenk(String getraenk) {
        this.getraenk = getraenk;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public void setKalorien(double kalorien) {
        this.kalorien = kalorien;
    }
    
public double gesamtKalorien(){
    
    double faktor = menge/100.0;
    
    return kalorien * faktor;
}

    @Override
    public String toString() {
        return getraenk + "hat auf " + menge + "ml" + " insgesamt " + gesamtKalorien() + kalorien;             // Ausgabe als Text + eigene Methode
    }

    

    








    
}
