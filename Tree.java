public class Tree {
    int size;
    TNode root;

    public Tree() {
        TNode root = null;
        int size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        TNode newNode = new TNode(val);

        if (isEmpty()) {
            root = newNode;
        } else {

            TNode temp = root;
            TNode parent = null;

            while (temp != null) {
                parent = temp;
                if (temp.val > val) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }

            if (parent.val < val) {
                parent.right = newNode;
            } else {
                parent.left = newNode;
            }
        }
    }
}
