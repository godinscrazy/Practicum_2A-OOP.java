public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;
    private double inhoud;
    private String Gegevens;

    public Zwembad( double br, double le, double di) {
        Breedte = br;
        Lengte = le;
        Diepte = di;

    }
    public Zwembad(double inh, String gg){
        inhoud = inh;
        Gegevens = gg;
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

    public double getinhoud() {
        return inhoud;
    }

    public void setinhoud(double inhoud) {
        this.inhoud = inhoud;
    }

    public String getGegevens() {
        return Gegevens;
    }

    public void setGegevens(String gegevens) {
        this.Gegevens = gegevens;
    }
}


public class Main {


    public static void main(String[] arg) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("DIEPTE: " + z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad();
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.inhoud());
    }
}
