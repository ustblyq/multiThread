package tree;

/**
 * @Author liuyiqiang
 * @Date 2018/7/28 22:51
 * @Version 1.0
 */
public class TreeTest {

    public static void main(String[] args) {
        TreeNode root = getTree();
        rootTraverse(root);
    }

    public static void rootTraverse(TreeNode root) {
        if(root != null) {
            System.out.println(root.getValue());
            rootTraverse(root.getLeft());
            rootTraverse(root.getRight());
        }
    }

    public static TreeNode getTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);

        root.setChild(node1, node2);
        node1.setLeft(node3);
        node2.setChild(node4, node5);
        node3.setRight(node6);
        node5.setRight(node7);
        return root;
    }
}
