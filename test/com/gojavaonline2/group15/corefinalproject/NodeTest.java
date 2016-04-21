package com.gojavaonline2.group15.corefinalproject;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class NodeTest {

    private final int a;
    private final int b;
    private final int expected;

    public NodeTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: compareTo({0},{1}={2}")

    public static Iterable<Object[]> data1(){
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {2, 2, 0},
                {8, 2, -1},
                {4, 5, 1}
        });
    }

    @Test
    public void compareToTest() throws Exception {
        Tree<Integer> tTree = new Tree<Integer>().add(a);
        Assert.assertEquals(expected, tTree.getRootNode().compareTo(b));
    }
}