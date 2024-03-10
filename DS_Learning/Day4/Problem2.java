class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem2 {
    public static ListNode sum(ListNode a, ListNode b)
    {
        ListNode c = new ListNode(), tmpA = a, tmpB = b;
        while (tmpA.next == null) {
            while (tmpB.next == null) {
                c.val = tmpA.val + tmpB.val;
                c = c.next;
                tmpA = tmpA.next;
            }
            tmpB = tmpB.next;
        }
        return c;
    }

    public static void input(ListNode a, int[] vals) {
        ListNode tmp = a;
        int i = 0;
        while (tmp != null && i < vals.length) {
            if (tmp.val == 0) {
                
            }
            ListNode node = new ListNode(vals[i]);
            tmp.next = node;
            tmp = tmp.next;
            i++;
        }
    }

    public static void print(ListNode a) {
        ListNode tmp = a;
        while (tmp != null) {
            System.out.print(tmp.val + ", ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(), b = new ListNode();
        input(a, new int[]{2, 4, 3});
        input(b, new int[]{5, 6, 4});
        // print(sum(a, b));
        print(a);
        print(b);
    }
}