
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        //previousMainLogic()
        System.out.println("~linked lists practice 2~");
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
        int removeIdx = 1;

        if(switching){
            removeAt(myNode, removeIdx);
        }

        while(current != null){
            System.out.println("Node: " + current + " -> \nNode Value: " + current.value);
            current = current.next;
        }
    }
    public static Node removeAt(Node head, int removeIdx){
        if(removeIdx < 0){
            throw new IndexOutOfBoundsException("removeIdx must be >= 0");
        }
        if(removeIdx == 0){
            return head.next;
        }

        Node current = head;

        for(int i = 0; i < removeIdx - 1; i++){
            if(current == null){
                throw new IndexOutOfBoundsException("removeIdx must be < len(list)");
            }
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }
    public void previousMainLogic() {
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
