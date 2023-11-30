import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalendarz kalendarz = new Kalendarz();

        int wybor = 0;
        System.out.println("Program to kalendarz");

        while (wybor >= 0) {
            wyswietlMenu();
            wybor = sc.nextInt();

            switch (wybor) {
                case 1 -> dodawanie(kalendarz, sc);
                case 2 -> usun(kalendarz, sc);
                case 3 -> wyswietlDzien(kalendarz, sc);
                case 4 -> wyswietlDzienPrio(kalendarz, sc);
            }
        }
    }

    static void dodawanie(Kalendarz kalendarz, Scanner sc) {
        System.out.println("Podaj opis");
        String opis = sc.next();

        System.out.println("Podaj dzien 1-7");
        int dzien = sc.nextInt();

        System.out.println("Podaj godzine startu");
        LocalTime czasRoz = LocalTime.parse(sc.next());

        System.out.println("Podaj godzine konca");
        LocalTime czasZak = LocalTime.parse(sc.next());

        System.out.println("Podaj priorytet 1-3 ");
        int priorytet = sc.nextInt();

        kalendarz.dodajSpotakenie(opis, dzien, czasRoz, czasZak, priorytet);
    }

    static void usun(Kalendarz kalendarz, Scanner sc) {
        System.out.println("Podaj czas startu ");
        LocalTime czasRoz = LocalTime.parse(sc.next());
        System.out.println("Podaj dzien 1-7 ");
        int dzien = sc.nextInt();
        kalendarz.usunSpotaknie(czasRoz, dzien);
    }

    static void wyswietlDzien(Kalendarz kalendarz, Scanner sc) {
        System.out.println("Podaj dzien 1-7 ");
        int dzien = sc.nextInt();
        kalendarz.wyswietlSpotkanie(dzien);
    }

    static void wyswietlDzienPrio(Kalendarz kalendarz , Scanner sc) {
        System.out.println("Podaj dzien 1-7 ");
        int dzien = sc.nextInt();
        System.out.println("Podaj priorytet 1-3 ");
        int priorytet = sc.nextInt();
        kalendarz.wyswietlSpotkanie(dzien, priorytet);
    }

    static void wyswietlMenu() {
        System.out.println("1. Dodaj date\n2. Usuń date");
        System.out.println("3. Wyswietl spotkanie\n4. Wyswietl spotkanie o priotytecie");
        System.out.println("-1. Oraz podaj liczbe ujemna by wyjsc\n");
    }

}