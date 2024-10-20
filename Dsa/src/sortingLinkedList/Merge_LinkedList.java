package sortingLinkedList;
 
public class Merge_LinkedList {
    Node root;

    void create() {
        root = null;
    }

    void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
    }

    // Merge function
    Node merge_list(Node r1, Node r2) {
        Node root3 = new Node(0); // Temporary dummy node to form the new list
        Node current = root3;

        while (r1 != null && r2 != null) {
            if (r1.data < r2.data) {
                current.next = r1;
                r1 = r1.next;
            } else {
                current.next = r2;
                r2 = r2.next;
            }
            current = current.next;
        }

        // Append remaining nodes
        if (r1 != null) {
            current.next = r1;
        } else {
            current.next = r2;
        }

        return root3.next; // Return the merged list, excluding the dummy node
    }

    // Merge Sort method
    void mergeSort() {
        root = mergeSortRec(root);
    }

    // Recursive Merge Sort
    Node mergeSortRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSortRec(head);
        Node right = mergeSortRec(nextOfMiddle);

        return merge_list(left, right);
    }

    // Function to get the middle of the linked list
    Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void print() {
        Node t = root;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Merge_LinkedList list1 = new Merge_LinkedList();
        list1.create();
        list1.insert(70);
        list1.insert(66);
        list1.insert(99);
        list1.insert(2);
        list1.insert(1);

        Merge_LinkedList list2 = new Merge_LinkedList();
        list2.create();
        list2.insert(25);
        list2.insert(27);
        list2.insert(24);
        list2.insert(11);
        list2.insert(5);

        // Merge the two lists
        Merge_LinkedList mergedList = new Merge_LinkedList();
        mergedList.root = mergedList.merge_list(list1.root, list2.root);

        // Print merged list
        System.out.println("Merged List:");
        mergedList.print();
    }
}
