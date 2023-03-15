package DZ.ALGS.TreeChangeColor.Node;

import DZ.ALGS.TreeChangeColor.Color.Color;

public class Node {
    public Node() {
        this.color = Color.RED;
    }

    private int value;
    private Color color;
    private Node leftChild;
    private Node rightChild;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append(getValue()).append(" ").append(getColor());
        return res.toString();
    }
}
