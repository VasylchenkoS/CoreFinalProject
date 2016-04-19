package com.gojavaonline2.group15.corefinalproject;

import java.util.Scanner;

// в данном классе организовывается создание дерева с консоли

public class ConsoleTreeCreator {

    public Tree<Integer> readDataFromConsole() {
        System.out.println("Введите, через Enter, ключи вашего дерева, следуюя принципам:\n" +
                "1. Тип данных ключа - Integer\n" +
                "2. Первое значение - значение вершины дерева\n" +
                "3. Далее вводить желаемые данные:\n" +
                "если в вершине ROOT хранится ключ X, то в левом (правом) поддереве должны храниться только\n" +
                "ключи меньшие (соответственно большие) чем X\n" +
                "4. Для завершения создания введите 0\n" +
                "5. Ключи должны быть уникальные(т.е. не повторятся)");
        Tree<Integer> tree = new Tree<>();
        int addNodeValue;
        while (true) {
            addNodeValue = readDataFromConsoleScanner();
            if (addNodeValue == 0)
                break;
            else tree.add(addNodeValue);
        }
        if (tree.getRootNode() != null)
            return tree;
        else return null;
    }

    public int readDataFromConsoleScanner() {
        int currentNodeValue = 0;
        try {
            Scanner scannerInputValue = new Scanner(System.in);
            try {
                currentNodeValue = scannerInputValue.nextInt();
            } catch (Exception ignored) {
                System.out.println("[Error:] Тип значений должен быть Integer");
            }
        } catch (Exception e) {
            System.out.println("[Error:]Something happens. " + e.getMessage());
        }
        return currentNodeValue;
    }
}