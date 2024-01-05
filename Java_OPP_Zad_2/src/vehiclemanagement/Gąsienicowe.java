package vehiclemanagement;

class Gąsienicowe extends Pojazd {
    @Override
    public final void uruchomSilnik() {
        super.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");
    }
}
