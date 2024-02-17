package rep;

public class repparimpar {

    public static void main(String[] args) {
        // int n = 1;

        /*
         * while(n<=15){
         * 
         * if(n%2 == 1){
         * System.out.print("*"+" ");
         * }
         * 
         * if(n%2 == 0){
         * System.out.print("**"+" ");
         * }
         * n++;
         * }
         */
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1) {
                System.out.print("*" + " ");
            }

            if (i % 2 == 0) {
                System.out.print("**" + " ");
            }
        }
    }
}
