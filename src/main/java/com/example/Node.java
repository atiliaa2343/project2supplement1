package main.java.com.example;


/** 
 * 
 * Represents a node in a binary search tree. 
 * Each node contains an integer identifier, data,and references to its left and right children.
 * It inserts new values.
 * 
 * */
public class Node {
    public int id;
    public int data;
    public Node left;
    public Node right; 
    
    /**
     * Constructs a new Node with the specified id and data.
     *
     * @param id   The unique identifier for the node.
     * @param data The data to store in the node.
     */
    public Node(int id, int data) {
        this.id = id;
        this.data = data;
    } 
  
    
    /**
     * Inserts a new value into the binary search tree.
     * If the value is less than the current node's data, it is inserted into the left subtree.
     * If the value is greater than or equal to the current node's data, it is inserted into the right subtree.
     *
     * @param value The value to insert into the tree.
     */

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
    
    /**
     * Generates a string representation of the tree starting from this node.
     * The string is formatted to show the hierarchy of nodes in a human-readable format.
     *
     * @return A string representing the structure and data of the tree.
     */

    public String dump() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node ID: ").append(id).append(", Data: ").append(data).append("\n");
        if (left != null) sb.append("\t").append(left.dump());
        if (right != null) sb.append("\t").append(right.dump());
        return sb.toString();
    }
}
