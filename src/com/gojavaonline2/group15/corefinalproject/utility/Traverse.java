package com.gojavaonline2.group15.corefinalproject.utility;

import com.gojavaonline2.group15.corefinalproject.beans.Node;

//  Обход дерева, это процесс обхождения всех узлов и их обрабатывании. Существует три типа обхода дерева:
//  Inorder – посещение левого поддерева, корня и правого поддерева.
//  Preorder – посещение корня, левого поддерева и правого поддерева.
//  Postorder – посещение левого поддерева, правого поддерева и корня.
//  В данном проекте используется рекурсивный подход обхода дерева.
public class Traverse {
    private static final StringBuilder result = new StringBuilder();
//  из-за использования рекурсивного подхода, приходится очищать данную строку результата
//  после каждого использования вне метода обхода
    public static void clearResult(){
       result.delete(0, result.length());
    }
//  Инфиксный обход используется тогда, когда нам надо обойти дерево в порядке,
//  соответствующем значениям узлов.
//  Мы обходим их от самого маленького до самого большого. То есть от левых поддеревьев к правым через корень.
    public static String inorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            inorderTraverse(current.getLeft());
            result.append(current.getValue()).append(" ");
            inorderTraverse(current.getRight());
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        }
        return result.toString();
    }

//  При префиксном обходе алгоритм получает значение текущего узла перед тем,
//  как перейти сначала в левое поддерево, а затем в правое.
//  Начиная от корня, сначала мы получим значение 4.
//  Затем таким же образом обходятся левый ребенок и его дети, затем правый ребенок и все его дети.
//  Префиксный обход обычно применяется для копирования дерева с сохранением его структуры.
    public static String preorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            result.append(current.getValue()).append(" ");
            preorderTraverse(current.getLeft());
            preorderTraverse(current.getRight());
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        } return result.toString();
    }

//  При постфиксном обходе мы посещаем левое поддерево, правое поддерево,
//  а потом, после обхода всех детей, переходим к самому узлу.
//  Постфиксный обход часто используется для полного удаления дерева,
//  так как в некоторых языках программирования необходимо убирать из памяти все узлы явно,
//  или для удаления поддерева. Поскольку корень в данном случае обрабатывается последним,
//  мы, таким образом, уменьшаем работу, необходимую для удаления узлов.
    public static String postorderTraverse(Node current) {
        try {
            if (current == null)
                return null;
            postorderTraverse(current.getLeft());
            postorderTraverse(current.getRight());
            result.append(current.getValue()).append(" ");
        } catch (Exception e) {
            System.out.println("[Error:]" + e.getMessage());
        } return result.toString();
    }

}
