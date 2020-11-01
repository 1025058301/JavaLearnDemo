package getoffer;

import java.util.*;
public class SF {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode root2=new TreeNode(8);
        TreeNode root3=new TreeNode(6);
        TreeNode root4=new TreeNode(4);
        TreeNode root5=new TreeNode(3);
        TreeNode root6=new TreeNode(5);
        TreeNode root7=new TreeNode(13);
        TreeNode root8=new TreeNode(20);
        TreeNode root9=new TreeNode(7);
        root.left=root2;
        root.right=root3;
        root2.right=root4;
        root3.left=root5;
        root3.right=root6;
        root5.left=root7;
        root5.right=root8;
        root6.left=root9;
        System.out.print(Serialize(root));

        

    }

    static String Serialize(TreeNode root) {
        StringBuffer res = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList();
        if (root == null) {
            return new String(res);
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.val == Integer.MAX_VALUE) {
                res.append("#!");
                continue;
            } else {
                res.append(cur.val + "!");
            }
            if (cur.left != null) {
                queue.offer(cur.left);
            } else {
                queue.offer(new TreeNode(Integer.MAX_VALUE));
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            } else {
                queue.offer(new TreeNode(Integer.MAX_VALUE));
            }
        }
        String s="123";
        return new String(res);
    }
}
