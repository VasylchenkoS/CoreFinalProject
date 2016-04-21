package com.gojavaonline2.group15.corefinalproject.userfriendlyinterface;

import com.gojavaonline2.group15.corefinalproject.utility.ConsoleTreeCreator;
import com.gojavaonline2.group15.corefinalproject.utility.SimpleTreeCreator;
import com.gojavaonline2.group15.corefinalproject.utility.Traverse;
import com.gojavaonline2.group15.corefinalproject.beans.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UserConsoleInterface {
    private Tree tree = null;

    public UserConsoleInterface() {
        System.out.println("Введите число, чтобы начать работу:\n" +
                "1. Создать Simple дерево с корнями Integer\n" +
                "2. Создать Simple дерево с корнями String\n" +
                "3. Создать свое дерево с корнями Integer\n" +
                "4. Выполнить префиксный обход \n" +
                "5. Выполнить инфиксный обход \n" +
                "6. Выполнить постфиксный обход \n" +
                "0. Завершить работу программы");
        userConsoleInterfaceReader();
    }

    private void userConsoleInterfaceReader() {
        int resultReader;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    resultReader = Integer.parseInt(bufferedReader.readLine());
                    if (resultReader == 0) break;
                    userConsoleInterfaceSelector(resultReader);
                } catch (Exception e) {
                    System.out.println("[Error:] Message: "+ e.getMessage());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("[Error:] NullPointerException. Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[Error:] Message: " + e.getMessage());
        }
    }

    private void userConsoleInterfaceSelector(Integer selectorValue) {
        switch (selectorValue) {
            case 1:
                tree = new SimpleTreeCreator().simpleIntegerTreeCreator();
                System.out.println("Теперь есть возможность выбрать метод сортировки");
                return;
            case 2:
                tree = new SimpleTreeCreator().simpleStringTreeCreator();
                System.out.println("Теперь есть возможность выбрать метод сортировки");
                return;
            case 3:
                tree = new ConsoleTreeCreator().readDataFromConsole();
                if (tree == null || tree.getRootNode() == null)
                    System.out.println("Дерево пустое. повторите процедуру");
                else System.out.println("Теперь есть возможность выбрать метод сортировки");
                return;
            case 4:
                if (tree == null || tree.getRootNode() == null) {
                    System.out.println("Дерево пустое");
                    break;
                }
                System.out.println(Traverse.preorderTraverse(tree.getRootNode()));
                Traverse.clearResult();
                System.out.println("Preorder Traverse Procedure Completed\n");
                return;
            case 5:
                if (tree == null || tree.getRootNode() == null) {
                    System.out.println("Дерево пустое");
                    break;
                }
                System.out.println(Traverse.inorderTraverse(tree.getRootNode()));
                Traverse.clearResult();
                System.out.println("Inorder Traverse Procedure Completed\n");
                return;
            case 6:
                if (tree == null || tree.getRootNode() == null) {
                    System.out.println("Дерево пустое");
                    break;
                }
                System.out.println(Traverse.postorderTraverse(tree.getRootNode()));
                Traverse.clearResult();
                System.out.println("Postorder Traverse Procedure Completed\n");
                return;
            default:
                System.out.println("Введено неверное значение выбора операции");
        }
    }
}

