import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        int bilangan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        bilangan = input.nextInt();
        System.out.println("Nilai Faktor dari" + bilangan + "adalah:");

        int [] angka = new int [bilangan];
        int count = 0;

        for (int i=1; i<=bilangan; i++)
        {
            if (bilangan%i ==0)
            {
                angka [count]=i;
                count++;
            }
        }

        for (int i = count; i >= 1; i--)
        {
            System.out.println(angka [i- 1]);
        }
    }
}
