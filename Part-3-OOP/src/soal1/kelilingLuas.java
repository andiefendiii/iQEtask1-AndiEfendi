package soal1;

public class kelilingLuas {

    public static void main(String[] args) {
        int sisiPersegi = 4;
        int luasPersegi =  sisiPersegi * sisiPersegi;
        int kelilingPersegi = 4 * sisiPersegi;

        float alasSegitiga = 3;
        float tinggisegitiga = 4;
        double luasSegitiga = 0.5*alasSegitiga*tinggisegitiga;
        double kelilingSegitiga = 3*alasSegitiga;

        int panjangPersegiPanjang = 7;
        int lebarPersegiPanjang = 8;
        int luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        int kelilingPersegiPanjang = panjangPersegiPanjang + lebarPersegiPanjang + panjangPersegiPanjang + lebarPersegiPanjang;

        System.out.println("luas");
        System.out.println("persegi  " + luasPersegi);
        System.out.println("segitiga  " + luasSegitiga);
        System.out.println("persegi panjang  " + luasPersegiPanjang);
        System.out.println("----------------------------------------");
        System.out.println("keliling  ");
        System.out.println("persegi  " + kelilingPersegi);
        System.out.println("segitiga  " + kelilingSegitiga);
        System.out.println("persegi panjang  " + kelilingPersegiPanjang);
    }
}
