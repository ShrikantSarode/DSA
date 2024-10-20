package dsaAssignment18oct;
import java.util.Scanner;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int key) {
        root = add(root, key);
    }

    
    Node add(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = add(root.left, data); 
        } else {
            root.right = add(root.right, data);  
        }
        return root;
    }

   
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        int ch;
        do {
            System.out.println("Menu");
            System.out.println("1. Insert");
            System.out.println("2. Pre-Order");
            System.out.println("3. Post-Order");
            System.out.println("4. In-Order");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Element: ");
                    int element = sc.nextInt();
                    obj.insert(element);
                    break;
                case 2:
                    obj.preorder(obj.root);
                    System.out.println();
                    break;
                case 3:
                    obj.postorder(obj.root);
                    System.out.println();
                    break;
                case 4:
                    obj.inorder(obj.root);  
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        } while (ch != 0);
        sc.close();
    }
}
