package main.java.com.example;

public class Node {
    public int id;
    public int data;
    public Node left;
    public Node right;

    public Node(int id, int data) {
        this.id = id;
        this.data = data;
    }

    public void insert(int value) {
        if (value < this.data) {
            if (this.left == null) {
                this.left = new Node(id + 1, value); // Simplified ID generation
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(id + 1, value); // Simplified ID generation
            } else {
                this.right.insert(value);
            }
        }
    }

    public String dump() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node ID: ").append(id).append(", Data: ").append(data).append("\n");
        if (left != null) sb.append("\t").append(left.dump());
        if (right != null) sb.append("\t").append(right.dump());
        return sb.toString();
    }
}
