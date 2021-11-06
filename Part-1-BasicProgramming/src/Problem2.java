public class Problem2 {

    public static void main(String[] args) {
        int studentScore = 56;

        if (studentScore <=100) {
            if (studentScore >=80) {
                System.out.println("Anda mendapatkan nilai A");
            }
            else if (studentScore >=65 & studentScore <=79) {
                System.out.println("Anda mendapatkan nilai B+");
            }
            else if (studentScore >=50 & studentScore <=64) {
                System.out.println("Anda mendapatkan nilai B");
            } else if (studentScore >=35 & studentScore <=49) {
                System.out.println("Anda mendapatkan nilai C");
            } else if (studentScore >=0 & studentScore <=34) {
                System.out.println("Anda mendapatkan nilai D");
            }
            else {
                System.out.println();
            }
        }

        else {
            System.out.println("invalid");
        }
    }
}
