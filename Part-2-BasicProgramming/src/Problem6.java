import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        int array[], i, n;
        array = new int[100];
        float rata, total=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        n = scan.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("Nilai Ke-"+ i +" : ");
            array[i] = scan.nextInt();
            total = total + array[i];
        }
        rata = total/n;

        System.out.println("Hasil mean: " + rata);
    }
}
