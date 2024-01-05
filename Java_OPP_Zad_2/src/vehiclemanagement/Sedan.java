package vehiclemanagement;

class Sedan extends Kołowe {
    private String model;
    private String symbol;

    public Sedan() {}

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.model = model;
        this.symbol = symbol;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
