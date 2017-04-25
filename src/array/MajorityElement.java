package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }

            if (m.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return 0;

    }

    public static void main(String[] args) {

    }

}
