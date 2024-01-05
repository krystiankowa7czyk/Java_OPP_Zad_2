package vehiclemanagement;

class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private int masa;

    public Pojazd() {}

    public Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, int masa) {
        this.rokProdukcji = rokProdukcji;
        this.rodzajSilnika = rodzajSilnika;
        this.kolor = kolor;
        this.masa = masa;
    }

    public void uruchomSilnik() {
        System.out.println("Silnik uruchomiono");
    }

    // Getters and setters
    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
}
