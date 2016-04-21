package com.gojavaonline2.group15.corefinalproject;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;
import com.gojavaonline2.group15.corefinalproject.utility.ConsoleTreeCreator;
import com.gojavaonline2.group15.corefinalproject.utility.Traverse;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static junit.framework.TestCase.assertEquals;

public class ConsoleTreeCreatorTest {

    private static Set<Integer> keyList;

    @BeforeClass
    public static void setUpClassTestStart() throws Exception {
        keyList = new TreeSet<>();
        keyList.add(10);
        keyList.add(35);
        keyList.add(5);
        keyList.add(1);
        keyList.add(4);
        keyList.add(99);
        keyList.add(20);
        keyList.add(31);
        keyList.add(17);
    }

    @After
    public void setUpTestFinish() throws Exception {
        Traverse.clearResult();
    }

    @Test
    public void testCreateTree() throws Exception {
        Tree<Integer> testTree= ConsoleTreeCreator.createTree(keyList);
        String testValue = "1 4 5 10 17 20 31 35 99 ";
        String strResult = Traverse.inorderTraverse(testTree.getRootNode());
        assertEquals(testValue, strResult);
    }
}