package test.java.com.example;

import main.java.com.example.Node; 

/** 
 * Unit tests 
 * These tests validate the different functions. 
 * 
 * */
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest { 
	
	/*** 
	 * Tests the insert function  
	 * Verifies that the nodes are correctly inserted 
	 * /
	 */

    @Test
    public void testNodeInsertion() {
        Node root = new Node(1, 10);
        root.insert(5);
        root.insert(15);
        root.insert(3);

        assertNotNull(root.left);
        assertNotNull(root.right);
        assertNotNull(root.left.left);

        assertEquals(5, root.left.data);
        assertEquals(15, root.right.data);
        assertEquals(3, root.left.left.data);
    } 
    
    /*** 
	 * Tests the dump function  
	 * Verifies that the nodes are correctly dumped 
	 * 
	 * 
	 * /
	 */

    @Test
    public void testDumpNode() {
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

