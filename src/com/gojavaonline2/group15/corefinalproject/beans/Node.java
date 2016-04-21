package com.gojavaonline2.group15.corefinalproject.beans;

import java.text.Collator;
import java.util.Locale;

//  В данном классе определена структура дерева

public class Node<T extends Comparable<T>> implements Comparable<T> {
    private Node<T> left;   // указатель на левого потомка
    private Node<T> right;  // указатель на правого потомка
    private T value;        // ключ узла

//    создаем констуктор, а так же getter и setter для єлементов класса

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

//  создаем метод для сравнения переменных внутри дерева

    public int compareTo(T object) {
//  т.к. метод compareTo() не совсем подъходит для сравнения строк, воспользуемся библлиотечным классом Collator.
//  Метод compare() выполняет сравнение имен двух файлов методом collator.compare(о1,о2)
//  Возвращает:
//  1 если первый параметр (о1) больше второго (о2),
//  -1 если первый параметр (о1) меньше второго (о2),
//  0 если они равны.
//  Имя первого файла считается больше второго имени, если
//  первый файл находится ближе к корню дерева папок.
        if (value.getClass() == String.class) {
            Collator collator = Collator.getInstance(new Locale("en", "US"));
            return collator.compare(object, value);
        }
//  Для типа Integer воспользуемся методом compareTo(о1,о2)
//  Возвращает:
//  1 если первый параметр (о1) больше второго (о2),
//  -1 если первый параметр (о1) меньше второго (о2),
//  0 если они равны.
        else return object.compareTo(value);
    }
}

