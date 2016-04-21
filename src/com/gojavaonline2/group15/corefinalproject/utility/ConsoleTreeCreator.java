package com.gojavaonline2.group15.corefinalproject.utility;

import com.gojavaonline2.group15.corefinalproject.beans.Tree;

import java.util.*;

// в данном классе организовывается создание дерева с консоли

public class ConsoleTreeCreator {

    private static Tree<Integer> tree;

    public static Tree<Integer> getTree() {
        return tree;
    }
    public static void setTree(Tree<Integer> tree) {
        ConsoleTreeCreator.tree = tree;
    }

    public Tree<Integer> readDataFromConsole() {
        System.out.println("Введите, через Enter, ключи вашего дерева, следуюя принципам:\n" +
                "1. Тип данных ключа - Integer\n" +
                "2. Первое значение - значение вершины дерева\n" +
                "3. Далее вводить желаемые данные:\n" +
                "если в вершине ROOT хранится ключ X, то в левом (правом) поддереве должны храниться только\n" +
                "ключи меньшие (соответственно большие) чем X\n" +
                "4. Для завершения создания введите 0\n" +
                "5. Ключи должны быть уникальные(т.е. не повторятся)");
        readDataFromConsoleScanner();
        if (tree.getRootNode() != null)
            return tree;
        else return null;
    }

    public static Tree<Integer> createTree(Set<Integer> nodeValue) {
        Tree<Integer> tTree = new Tree<>();
        nodeValue.forEach(tTree::add);
        setTree(tTree);
        return tTree;
    }

    public void readDataFromConsoleScanner() {
        int currentNodeValue;
        Set<Integer> nodeList = new TreeSet<>();
        try {
            Scanner scannerInputValue = new Scanner(System.in);
            while (true) {
                try {
                    currentNodeValue = scannerInputValue.nextInt();
                    if (currentNodeValue == 0)
                        break;
                    else if(nodeList.contains(currentNodeValue)) {
                        System.out.println("[Error:] Ключи не должны повторятся!");
                    }
                    else nodeList.add(currentNodeValue);
                } catch (Exception ignored) {
                    System.out.println("[Error:] Тип значений должен быть Integer");
                }
            }
        } catch (Exception e) {
            System.out.println("[Error:]Something happens. " + e.getMessage());
        }
        createTree(nodeList);
    }
}