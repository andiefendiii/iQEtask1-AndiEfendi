import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan X: ");
        int x = input.nextInt();
        System.out.println("Masukkan Y: ");
        int y = input.nextInt();

        double hasil;
        hasil = Math.pow(x,y);
        System.out.println("Hasil:" + hasil);
    }
}
