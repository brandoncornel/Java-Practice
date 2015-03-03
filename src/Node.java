/**
 * Created by BrandonCornel on 3/2/15.
 */
public class Node {
    private int value;
    public Node prev, next = null;

    public Node(int value){
        this.value = value;
        prev = null;
        next = null;
    }

    public int getValue(){
        return value;
    }

    public Node getNext(){
        return next;
    }

}
