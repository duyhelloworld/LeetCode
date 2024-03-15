/*
Given the head of a singly linked list, 
    return the middle node of the linked list.
    If there are two middle nodes, 
        return the second middle node.

 * Input: head = [1,2,3,4,5]
    Output: [3,4,5]
Explanation: The middle node of the list is node 3.
* Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: 
Since the list has two middle nodes with values 3 and 4,
we return the second one.
 */
class Node {
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
    
    int length(Node node) {
        int len = 0;
        Node tmp = node;
        while (true) {
            if (tmp.next == null) {
                return len;
            }
            len++;
            tmp = node.next;
        }
    }
}
public class Problem876 {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.length(node);
    }

}