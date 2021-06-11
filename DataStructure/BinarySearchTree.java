/**
 * BinaryTree
 */
public class BinarySearchTree {

    TreeNode root;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(12);
        bst.inOrderPrint();
    }

    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int val) {
        root = new TreeNode(val);
    }

    public void add(int val) {
        TreeNode temp = this.root;
        if(temp == null) {
            this.root = new TreeNode(val);
            return;
        }
        addRecursive(temp, val);
    }

    private TreeNode addRecursive(TreeNode temp, int val) {
        if (temp == null) {
            return new TreeNode(val);
        }

        if (val < temp.value) {
            temp.left = addRecursive(temp.left, val);
        } else if (val > temp.value) {
            temp.right = addRecursive(temp.right, val);
        } else {
            TreeNode tempVal = temp.right;
            temp.right = new TreeNode(val);
            temp.right.right = tempVal;
            return temp;
        }
        return temp;
    }

    public void inOrderPrint() {
        TreeNode temp = this.root;
        inOrderPrintDriver(temp);
        System.out.println();
    }

    public void inOrderPrintDriver(TreeNode root) {
        if (root == null)
            return;
        inOrderPrintDriver(root.left);
        System.out.print(root.value);
        inOrderPrintDriver(root.right);
    }

    public void remove(int val) {
        var temp = this.root;
        removeDriver(temp, val);
    }

    public TreeNode removeDriver(TreeNode temp, int val) {
        // ----------------------- Base Case ---------------------
        // Check if val = root.value
        if (temp == this.root && this.root.value == val) {
            var tempLeftRoot = this.root.left;
            this.root = this.root.right;
            this.root.left = tempLeftRoot;
            return temp;
        }

        if (temp.value == val) {
            return temp;
        }
        // --------------------- End of Base Case --------------------

        // Traverse
        if (val < temp.value) {
            removeDriver(temp.left, val);
        } else if (val > temp.value) {
            removeDriver(temp.right, val);
        }

        // Remove
        if (temp.left != null && temp.left.value == val) {
            temp.left = temp.left.left;
        } else if (temp.right != null && temp.right.value == val) {
            temp.right = temp.right.right;
        }
        return temp;
    }

}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value) {
        this.value = value;
    }
}