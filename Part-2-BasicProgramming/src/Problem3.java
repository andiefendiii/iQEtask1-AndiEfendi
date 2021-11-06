public class Problem3 {

    public static void main(String[] args) {
        int num = 5;
        int count =0;
        for (int i= 0; i < num;i++){
            for (int j= 0; j< num;j++){
                count ++;
                if (count % 3==0){
                    System.out.print("X");
                } else {
                    if (count %2 == 0){
                        System.out.print("Z");
                    } else{
                        System.out.print("Y");
                    }
                }
            }
            System.out.print("\n");

        }
    }
}
