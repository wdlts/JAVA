package DZ.DZ5;

//         1
//       /   \
//      2      3
//     /     /   \
//    4     5     6
//  /   \        / \
// 7     9     11   20

import java.io.PrintStream;

public class Tree {

    public static void main(String[] args) {
        Node root =
                new Node(1,
                        new Node(2,
                                new Node(4, new Node(7), new Node(9)),null),
                        new Node(3, new Node(5),
                                new Node(6, new Node(11), new Node(20))));
        System.out.println("Nodes sum = " + root.sum());
        Node.preOrder(root, "");
    }
    static class Node {
        int value;
        Node left;
        Node right;

        public Node (int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(int value){
            this.value = value;
        }
        public int sum () {
            int summ = value;
            if (left != null){
                summ += left.sum();
            }
            if (right != null){
                summ += right.sum();
            }
            return summ;
        }
        public static void preOrder (Node root, String sp){
            if (root!=null){
                System.out.print(sp + root.value);
                preOrder(root.left, "(");
                if (root.left!=null){
                    preOrder(root.right, ",");
                }
            if (root.right==null && root.left!=null){
                    System.out.print(","+"null"+")");
                }
            if (root.right!=null){
                    System.out.print(")");
                }
                }
        }
    }
}
