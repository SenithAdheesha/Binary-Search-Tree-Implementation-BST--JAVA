public class TreeApp {

    public static void main(String [] args){

        Tree x = new Tree();

        System.out.println(x.isEmpty());
        x.insert(2);
        x.insert(4);
        x.insert(6);
        x.insert(3);
        x.insert(1);
        x.insert(9);
        x.insert(0);
        x.insert(7);
        x.insert(8);
        System.out.println(x.isEmpty());
    }
    
}
