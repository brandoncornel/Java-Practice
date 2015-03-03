/**
 * Created by BrandonCornel on 3/2/15.
 */
public class LinkedList {

    private Node head;
    private int listCount;

    public LinkedList(){
        head = null;
        listCount = 0;
    }

    public void add(int value){
        if(head != null) {
            Node nodeTemp = new Node(value);
            Node nodeCurrent = head;

            while (nodeCurrent.getNext() != null) {
                nodeCurrent = nodeCurrent.getNext();
            }
            nodeCurrent.next = nodeTemp;
        }else{
            head = new Node(value);
        }
        listCount++;
    }

    public int getValue(int index){
        Node nodeCurrent = head;
        for(int i = 0;i<index;i++){
            nodeCurrent = nodeCurrent.getNext();
        }
        return nodeCurrent.getValue();
    }

    public void remove(int index){
        Node nodeCurrent = head;
        for(int i = 0;i<index-1;i++){
            nodeCurrent = nodeCurrent.getNext();
        }
        nodeCurrent.next = nodeCurrent.next.next;
    }

    public String toString(){
        if(head == null){
            return "Empty List";
        }else{
            String sentence = "";
            Node nodeCurrent = head;
            while(nodeCurrent != null){
                sentence += (Integer.toString(nodeCurrent.getValue())) + " ";
                nodeCurrent = nodeCurrent.getNext();
            }
            return sentence;

        }
    }



}
