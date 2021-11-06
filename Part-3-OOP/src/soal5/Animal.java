package soal5;

public class Animal {

    String namaBinatang;
    String jenisMakanan;
    String jenisGigi;


    public static void main(String[] args) {

        herbivor herbi = new herbivor();
        karnivor carni = new karnivor();
        omnivor omni = new omnivor();


        System.out.println("Hi I'm parents of all animals, my name is binatang");
        herbi.identify_myself();
        carni.identify_myself();
        omni.identify_myself();

    }
}
