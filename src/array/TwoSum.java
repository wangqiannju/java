/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package array;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author qianwang.wq
 * @version $Id: TwoSum.java, v 0.1 2017年3月30日 下午5:51:22 qianwang.wq Exp $
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] { 0, 0 };
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i]) && m.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = m.get(target - nums[i]);
                return result;
            }
        }

        return result;

    }
}
