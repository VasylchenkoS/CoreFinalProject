package com.gojavaonline2.group15.corefinalproject;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;
import com.gojavaonline2.group15.corefinalproject.utility.Traverse;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TraverseTest {

    private static Tree<Integer> treeTest;
    private static Tree<Integer> treeTest1;
    private static Tree<Integer> treeTest2;

    @BeforeClass
    public static void setUpClassTestStart() throws Exception {
        treeTest = new Tree<Integer>().add(10).add(35)
                .add(5).add(1).add(4).add(99)
                .add(20).add(31).add(17);
        treeTest1 = new Tree<Integer>().add(9).add(8)
                .add(7).add(6).add(5).add(4)
                .add(3).add(2).add(1);
        treeTest2 = new Tree<>();
    }

    @After
    public void setUpTestFinish() throws Exception {
        Traverse.clearResult();
    }

    @Test(timeout = 1000)
    public void testInorderTraverse() throws Exception {
        String testValue = "1 4 5 10 17 20 31 35 99 ";
        String strResult = Traverse.inorderTraverse(treeTest.getRootNode());
        assertEquals(testValue, strResult);
    }

    @Test(timeout = 1000)
    public void testPreorderTraverse() throws Exception {
        String testValue = "9 8 7 6 5 4 3 2 1 ";
        String strResult = Traverse.preorderTraverse(treeTest1.getRootNode());
        assertEquals(testValue, strResult);
    }


    @Test(timeout = 1000)
    public void testPostorderTraverse() throws Exception {
        String testValue = null;
        String strResult = Traverse.postorderTraverse(treeTest2.getRootNode());
        assertEquals(testValue, strResult);
    }

}