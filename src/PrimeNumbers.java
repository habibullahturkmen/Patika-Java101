public class PrimeNumbers {

    public static void main(String[] args) {

        for(int iter1 = 2; iter1 <= 100; iter1++) {

            int zero = 0;

            for (int iter2 = 2; iter2 < iter1; iter2++) {
                if (iter1 % iter2 == 0) {
                    zero = 1;
                    break;
                }
            }

            if(zero == 0) {
                System.out.print(iter1 + " ");
            }
        }
    }
}
