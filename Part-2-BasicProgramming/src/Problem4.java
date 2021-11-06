import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int x = input.nextInt();

        String tabel = "";
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {

                if (i * j < 10)
                {
                    tabel += " " + i * j;
                }
                else
                {
                    tabel += " " + i * j;
                }
            }

            tabel += "\n";
        }

        System.out.println(tabel);
    }
}
