package vanek;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pojistenci {

    public Scanner sc = new Scanner(System.in);
    private List<Pojistenec> seznam = new ArrayList<>();

    public void pridejPojistence() {
        System.out.printf("Zadejte jméno:%n");
        String jmeno = zadejText();
        System.out.printf("Zadejte přijmení:%n");
        String prijmeni = zadejText();
        System.out.printf("Zadejte věk:%n");
        int vek = zadejCislo();
        System.out.printf("Zadejte telefonní číslo:%n");
        int telefon = zadejCislo();

        seznam.add(new Pojistenec(jmeno, prijmeni, vek, telefon));

        //pokracujteLibovolnouKlavesou("Data byla uložena. ");
        System.out.printf("Pojištěnec byl přidán.%n");
        System.out.printf("%n");
    }

    public void vypisVsechnyPojistence() {
        System.out.printf("Seznam všech pojištěnců:%n");
        for (Pojistenec tmp: seznam) {
            System.out.printf("%s%n", tmp);
        }

        //pokracujteLibovolnouKlavesou("");
        System.out.printf("%n");
    }

    public void vyhledejPojistence() {
        System.out.printf("Zadejte jméno:%n");
        String jmeno = zadejText();
        System.out.printf("Zadejte přijmení:%n");
        String prijmeni = zadejText();

        System.out.printf("Výsledek hledání:%n");
        for (Pojistenec tmp: seznam) {
            if ( (tmp.getJmeno().compareTo(jmeno) == 0 ) && (tmp.getPrijmeni().compareTo(prijmeni) == 0 ) ) {
                System.out.printf("%s%n", tmp);
            }
        }

        //pokracujteLibovolnouKlavesou("");
        System.out.printf("%n");
    }

    public void pokracujteLibovolnouKlavesou(String popis) {
        System.out.printf("%sPokračujte libovolnou klávesou.", popis);
        sc.nextLine();
    }

    public String zadejText() {
        String text;
        boolean zadano = false;

        do {
            text = sc.nextLine();
            if (!text.equals("")) {
                zadano = true;
            } else {
                System.out.printf("Musí být vyplněno. Opakujte zadání.%n");
            }
        } while (!zadano);

        return text;
    }

    public int zadejCislo() {
        Integer cislo = null;
        boolean zadano = false;

        do {
            try {
                cislo = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("Musí být vyplněno číslo. Opakujte zadání.%n");
            }
            if (cislo != null) {
                zadano = true;
            }
        } while (!zadano);

        return cislo;
    }

}
