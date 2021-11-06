import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int angka = input.nextInt();
        int bilangan;
        boolean prima = true;

        for (int pembagi = 2; pembagi <= angka/2; pembagi ++)
        {
            bilangan = angka % pembagi;
            if (bilangan == 0){
                prima = false;
                break;
            }
        }

        if (prima && ((angka>0 ) && (angka !=1)))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
