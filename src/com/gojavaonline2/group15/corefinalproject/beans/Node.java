package com.gojavaonline2.group15.corefinalproject.beans;

import java.text.Collator;
import java.util.Locale;


public class Node<T extends Comparable<T>> implements Comparable<T> {
    private Node<T> left;
    private Node<T> right;
    private final T value;

    public Node(Node<T> left, Node<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }


    public int compareTo(T object) {
        if (value.getClass() == String.class) {
            Collator collator = Collator.getInstance(new Locale("en", "US"));
            return collator.compare(object, value);
        }
        else return object.compareTo(value);
    }
}

