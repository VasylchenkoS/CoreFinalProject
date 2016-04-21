package com.gojavaonline2.group15.corefinalproject.utility;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;

public class SimpleTreeCreator {
    public Tree<Integer> simpleIntegerTreeCreator() {
        return new Tree<Integer>().add(7).add(8)
                .add(9).add(5).add(6).add(4)
                .add(2).add(3).add(1);
    }

    public Tree<String> simpleStringTreeCreator() {
        return new Tree<String>().add("node7").add("node8")
                .add("node9").add("node5").add("node6").add("node4")
                .add("node2").add("node3").add("node1");
    }
}
