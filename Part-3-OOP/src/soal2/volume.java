package soal2;

public class volume {

    public static void main(String[] args) {
        int sisiKubus = 10;
        int volumeKubus = sisiKubus * sisiKubus * sisiKubus;

        int panjangBalok = 3;
        int lebarbalok = 6;
        int tinggiBalok = 10;
        int volumeBalok = 2 * ((panjangBalok + lebarbalok) + (panjangBalok + tinggiBalok) + (lebarbalok + tinggiBalok));

        double Phi = 3.14;
        double jariJari = 7;
        double tinggiTabung = 10;
        double volumeTabung= (Phi * jariJari * jariJari) * tinggiTabung;

        System.out.println("volume  ");
        System.out.println("volume kubus  " + volumeKubus);
        System.out.println("volume Balok  "+ volumeBalok);
        System.out.println("volume Tabung  " + volumeTabung);


    }
}
