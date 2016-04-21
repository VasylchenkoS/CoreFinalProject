package com.gojavaonline2.group15.corefinalproject;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;
import com.gojavaonline2.group15.corefinalproject.utility.Traverse;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TraverseTest {

    private static Tree<Integer> treeTest;

    @BeforeClass
    public static void setUpClassTestStart() throws Exception {
        treeTest = new Tree<Integer>().add(10).add(35)
                .add(5).add(1).add(4).add(99)
                .add(20).add(31).add(17);
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
        String testValue = "10 5 1 4 35 20 17 31 99 ";
        String strResult = Traverse.preorderTraverse(treeTest.getRootNode());
        assertEquals(testValue, strResult);
    }


    @Test(timeout = 1000)
    public void testPostorderTraverse() throws Exception {
        String testValue = "4 1 5 17 31 20 99 35 10 ";
        String strResult = Traverse.postorderTraverse(treeTest.getRootNode());
        assertEquals(testValue, strResult);
    }

}