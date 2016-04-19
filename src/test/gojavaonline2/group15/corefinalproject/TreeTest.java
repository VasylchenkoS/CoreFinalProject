package test.gojavaonline2.group15.corefinalproject;

import com.gojavaonline2.group15.corefinalproject.Tree;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TreeTest {

    @Test(timeout = 1000)
    public void testAdd() throws Exception {
        Tree<Integer> treeTest = new Tree<Integer>().add(5).add(1);
        assertEquals((int)treeTest.getRootNode().getValue(), 5);
        assertEquals((int)treeTest.getRootNode().getLeft().getValue(), 1);
    }

}