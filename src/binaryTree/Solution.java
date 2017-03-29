/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package binaryTree;

/**
 * 
 * @author qianwang.wq
 * @version $Id: Solution.java, v 0.1 2017年3月29日 下午3:09:06 qianwang.wq Exp $
 */
public class Solution {

    public class TreeNode {
        int      val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        if (p == null && q == null)
            return true;

        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

    }

}
