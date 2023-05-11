package vanek;

public class Pojistenec {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;

    public Pojistenec(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        String celeJmeno = jmeno +" "+ prijmeni;
        for (int i = celeJmeno.length(); i <= 30; i++) {
            celeJmeno += " ";
        }

        return String.format("%s %3d  %d", celeJmeno, vek, telefon);
    }
}
