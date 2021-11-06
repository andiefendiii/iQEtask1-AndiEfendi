import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kata : ");
        String kata1 = input.nextLine();
        String kata = kata1.toUpperCase();

        int key = 10;
        String[] huruf = new String[26];

        for (char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

        System.out.println("Plain Text : " + kata);


        String cipher = "";
        loop1:
        for (int a = 0; a < kata.length(); a++) {

            int index_plain = -1;
            for (int b = 0; b < huruf.length; b++) {

                index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;

                if (index_plain != -1) {

                    cipher += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }

            cipher += kata.charAt(a);
        }

        System.out.println("Cipher Text : " + cipher);
    }
}
