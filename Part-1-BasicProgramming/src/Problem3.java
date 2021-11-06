import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        int bilangan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        bilangan = input.nextInt();
        System.out.println("Nilai faktor dari" + bilangan + "adalah:");
        for (int i=1; i<=bilangan; i++)
        {
            if (bilangan%i == 0)
            {
                System.out.println(i + "");
            }
        }
    }
}
