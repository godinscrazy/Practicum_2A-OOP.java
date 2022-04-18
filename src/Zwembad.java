public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;



    public Zwembad( double br, double le, double di) {
        setBreedte(br);
        setDiepte(di);
        setLengte(le);


    }
    public Zwembad() {
    }

    public double getBreedte() {
        return Breedte;
    }

    public void setBreedte(double breedte) {
        Breedte = breedte;
    }

    public double getLengte() {
        return Lengte;
    }

    public void setLengte(double lengte) {
        Lengte = lengte;
    }

    public double getDiepte() {
        return Diepte;
    }

    public void setDiepte(double diepte) {
        Diepte = diepte;
    }

    public double inhoud() {
        double inhoud = (Breedte*Lengte*Diepte);
        return inhoud;

    }
 public String toString() {
        String s = "Dit zwembad is " + Breedte + " meter breed," + " " + Lengte + " meter lang," + " en" + " " + Diepte + " meter diep";
        return s;
 }
}
