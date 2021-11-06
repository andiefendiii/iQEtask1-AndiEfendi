import java.util.Scanner;

public class Problem6 {

    private static int index;

    public static void main(String[] args) {
        String kataAsli,kataBalik = "";

        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan kata : ");
        kataAsli= inputUser.nextLine();
        int panjang = kataAsli.length();
        for (int index = panjang -1; index>=0; index--)
        {
            kataBalik= kataBalik +kataAsli.charAt(index);
        }

        if (kataAsli.equals(kataBalik))
        {
            System.out.println("ini kata polidrome");
        }
        else {
            System.out.println("ini bukan kata polidrome");
        }

    }
}
