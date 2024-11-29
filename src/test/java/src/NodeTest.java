import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testNodeInsertion() {
        Node root = new Node(1, 10); // Root node with ID 1 and data 10

        // Insert data into the tree
        root.insert(5);  // Insert into left child
        root.insert(2); // Insert into right child
        root.insert(60);  // Insert into left-left grandchild

       
        assertNotNull(root.left);
        assertNotNull(root.right);
        assertNotNull(root.left.left);

        assertEquals(5, root.left.data);
        assertEquals(15, root.right.data);
        assertEquals(3, root.left.left.data);
    }

    @Test
    void testDumpNode() {
        Node root = new Node(1, 10);
        root.insert(5);
        root.insert(15);

        String expectedDump =
            "Node ID: 1, Data: 10\n" +
            "\tNode ID: 2, Data: 5\n" +
            "\tNode ID: 3, Data: 15\n";

        assertEquals(expectedDump, root.dump());
    }
}
