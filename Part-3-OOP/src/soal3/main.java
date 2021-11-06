package soal3;

public class main {

    public static void main(String[] args) {

        operasi operasitambah = new operasi();
        operasi operasikurang = new operasi();
        operasi operasikali = new operasi();
        operasi operasibagi = new operasi();

        operasitambah.i = 3;
        operasitambah.j = 4;
        operasikurang.k = 15;
        operasikurang.l = 4;
        operasikali.m = 10;
        operasikali.n = 10;
        operasibagi.o = 12;
        operasibagi.p = 3;

        operasitambah.tambah();
        operasikurang.kurang();
        operasikali.kali();
        operasibagi.bagi();
    }
}
