package soal4;

public class dimensiBarang {

    public static void main(String[] args) {

        double panjangBarang = 5;
        double lebarBarang = 2;
        double tinggiBarang = 4;
        double dimensiPanjang = panjangBarang/50;
        double dimensiLebar = lebarBarang/50;
        double dimensiTinggi = tinggiBarang/50;

        double beratBarang = 1;
        double dimensi = (Math.ceil(dimensiPanjang) * Math.ceil(dimensiLebar) * Math.ceil(dimensiTinggi) * beratBarang*5000);

        System.out.println(dimensi);
    }
}
