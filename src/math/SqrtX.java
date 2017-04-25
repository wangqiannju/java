package math;

public class SqrtX {

    public static int mySqrt(int x) {
        int left = 0;
        int right = x - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid > x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));

        System.out.println(mySqrt(3 * 3));

        System.out.println(mySqrt(9 * 9));

        System.out.println(mySqrt(64 * 64));

        System.out.println(mySqrt(100 * 100));
    }

}
