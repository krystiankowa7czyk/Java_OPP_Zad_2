package vehiclemanagement;

public class main {
    public static void main(String[] args) {

        Golf golf1 = new Golf(2019, "elektryczny", "biały", 1200, "195/70 R15");
        Golf golf2 = new Golf(2012, "benzynowy", "czerwony", 1500, "185/70 R16");
        Golf golf3 = new Golf(2009, "diesel", "niebieski", 1800, "195/80 R17");


        golf1.uruchomSilnik();
    }
}
