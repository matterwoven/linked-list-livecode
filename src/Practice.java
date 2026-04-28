
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        System.out.println("~linked lists practice~");
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);

        myNode.next = otherNode;
        otherNode.next = coolNode;

        ArrayList<Node> nodeArray = new ArrayList<>();
        nodeArray.add(myNode);
        nodeArray.add(otherNode);
        nodeArray.add(coolNode);

        Node current = myNode;

        Boolean switching = true;

        if(switching){
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
        else{
            for(Node n : nodeArray){
                System.out.println("Node: " + n + " -> \nNode Value: " + n.value);
            }
        }
        
        //System.out.println("Node Address: " + myNode + " | " + "Node value: " + myNode.value);
    }
}
