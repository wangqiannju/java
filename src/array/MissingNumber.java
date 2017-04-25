package array;

import java.util.BitSet;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        BitSet bitSet = new BitSet(nums.length + 1);
        for (int i = 0; i < nums.length; i++) {
            bitSet.set(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (bitSet.get(i) == false) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {

    }

}
