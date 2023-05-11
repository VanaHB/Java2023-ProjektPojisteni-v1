package vanek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pojistenci pojistenci = new Pojistenci();
        int volba = 0;

        do {
            vypisMenu();
            try {
                volba = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                volba = 0;
            }
            switch (volba) {
                case 1:
                    pojistenci.pridejPojistence();
                    break;
                case 2:
                    pojistenci.vypisVsechnyPojistence();
                    break;
                case 3:
                    pojistenci.vyhledejPojistence();
                    break;
                case 4:
                    System.out.printf("Ukončuji program.%n");
                    break;
                default:
                    System.out.printf("Byla zadána neplatná volba.%n%n");
            }
        } while (volba != 4);
    }

    public static void vypisMenu() {
        System.out.printf("----------------------------%n");
        System.out.printf("Evidence pojištěných%n");
        System.out.printf("----------------------------%n");
        System.out.printf("Vyberte si akci:%n");
        System.out.printf("1 - Přidat nového pojistníka%n");
        System.out.printf("2 - Vypsat všechny pojistníky%n");
        System.out.printf("3 - Vyhledat pojistníka%n");
        System.out.printf("4 - Konec programu%n");
    }

}