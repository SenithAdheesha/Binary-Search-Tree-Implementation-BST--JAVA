public class TNode{
    
    int val;
    TNode left;
    TNode right;

    public TNode(int val, TNode left, TNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TNode(int val){
        this(val,null,null);
    }
}