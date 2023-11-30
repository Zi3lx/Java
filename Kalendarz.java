import java.time.LocalTime;
import java.util.ArrayList;
public class Kalendarz {
    ArrayList<Spotkanie> arrayList;

    public Kalendarz() {
        arrayList = new ArrayList<>();
    }

    public void dodajSpotakenie(String opis, int dzien, LocalTime czasRozpoczecia, LocalTime czasZakonczenia, int priotytet) {
        if (Spotkanie.sprawdzCzas(czasRozpoczecia)) return;
        Spotkanie spotkanie = new Spotkanie(opis, dzien, czasRozpoczecia, czasZakonczenia, priotytet);
        arrayList.add(spotkanie);
    }

    public void usunSpotaknie(LocalTime czasRoz, int dzien) {
        for (Spotkanie data : arrayList) {
            if (data.czasRozpoczecia == czasRoz && data.dzien == dzien) {
                arrayList.remove(data);
                break;
            }
        }
    }

    public void wyswietlSpotkanie(int dzien) {
        for (Spotkanie data : arrayList) {
            if (data.dzien == dzien) {
                data.wyswietl();
            }
        }
    }

    public void wyswietlSpotkanie(int dzien, int priotytet) {
        for (Spotkanie data : arrayList) {
            if (data.dzien == dzien && data.priorytet == priotytet) {
                data.wyswietl();
            }
        }
    }
}
