import java.time.LocalTime;

public class Spotkanie {
    String opis;
    LocalTime czasRozpoczecia;
    LocalTime czasZakonczenia;
    int priorytet;
    static final LocalTime godzinaStartu = LocalTime.of(9,0,0);
    int dzien;

    public Spotkanie(String opis, int dzien, LocalTime czasRozpoczecia, LocalTime czasZakonczenia, int priotytet) {
        this.opis = opis;
        this.dzien = dzien;
        this.czasRozpoczecia = czasRozpoczecia;
        this.czasZakonczenia = czasZakonczenia;
        this.priorytet = priotytet;
    }

    public void wyswietl() {
        System.out.println("Dzien: " + dzien + " Czas roz: " + czasRozpoczecia + " Czas zak: " + czasZakonczenia +
            " Priorytet: " + priorytet + " Opis: " + opis);
    }

    public static Boolean sprawdzCzas(LocalTime czasRozpoczecia) {
        int help = czasRozpoczecia.compareTo(godzinaStartu);

        if (help < 0) {
            System.out.println("Za wcześnie");
            return true;
        }
        return false;
    }

}
