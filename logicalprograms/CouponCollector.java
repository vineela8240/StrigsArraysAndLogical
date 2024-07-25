package logicalprograms;
import java.util.Random;


public class CouponCollector {


        // Function to generate a random coupon number
        public static int generateRandomCoupon(int N) {
            Random random = new Random();
            return random.nextInt(N);
        }

        // Function to simulate the coupon collection process
        public static int collectCoupons(int N) {
            boolean[] collectedCoupons = new boolean[N];
            int totalRandomNumbers = 0;
            int distinctCoupons = 0;

            while (distinctCoupons < N) {
                int newCoupon = generateRandomCoupon(N);
                totalRandomNumbers++;
                if (!collectedCoupons[newCoupon]) {
                    collectedCoupons[newCoupon] = true;
                    distinctCoupons++;
                }
            }

            return totalRandomNumbers;
        }

        public static void main(String[] args) {
            int N = 10; // Example: 10 distinct coupon numbers
            int totalRandomNumbers = collectCoupons(N);
            System.out.println("Total random numbers needed to collect all " + N + " distinct coupons: " + totalRandomNumbers);
        }
    }


