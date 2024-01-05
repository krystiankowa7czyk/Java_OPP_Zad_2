package vehiclemanagement;
class Kołowe extends Pojazd {
    private String rozmiarOpony;

    public Kołowe() {}

    public Kołowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.rozmiarOpony = rozmiarOpony;
    }

    public void uruchomSilnik(String rodzajSilnika) {
        System.out.println("uruchomiono silnik " + rodzajSilnika);
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }

    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }
}
