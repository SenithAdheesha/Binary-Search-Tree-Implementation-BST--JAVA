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
        size++;
    }
}
//search in iteration 
   public TNode searchIter(int value) {
        TNode temp = root;
        while (temp != null) {
            if (temp.value = value) {
                break;
            } else {
                if (temp.value > value) {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
            }

        }
        return temp;
    }
    
 }
}

//search implementaion in recursion
public TNode search(TNode root,int v){
    if(root == null){
        return null; 
    }else {
        if(root.value == v){
            return root; 
        }else { 
            if(root.value < v){
                return search(root.right, v);
            }else { 
                return search(root.left, v);
            } 
        } 
    } 
}
public class TreeRecursice{

    TNode root;
    int size 

    public TreeRecursice(){
        root = null;
        size = 0
    }

    add(root,value){
        TNode newNode = new TNode(int value);
        root = newNode;

        if(root.value < value){
            add(root.right,value);
        }else{
            add(root.left, value);
        }

    }

//Recursion
