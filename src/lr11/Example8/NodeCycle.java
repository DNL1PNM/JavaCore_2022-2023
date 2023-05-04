package lr11.Example8;

import  java.util.Scanner;
public class NodeCycle {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        NodeCycle list = new NodeCycle();
        list.addFirst(7);
        System.out.println("Список после добавления элемента в начало : " + list.toString());
        list.addLast(7);
        System.out.println("Список после добавления элемента в конец : " + list.toString());
        list.createHead();
        System.out.println("Список после ввода с головы: " + list.toString());
        list.createTail();
        System.out.println("Список после ввода с хвоста : " + list.toString());
        list.insert(1,2);
        System.out.println("Введите любую цифру для продолжения");
        int contin1 = id.nextInt();
        System.out.println("Список после вставки элемента 1, на указанное место 3: " + list.toString());
        System.out.println("Введите любую цифру для продолжения");
        int contin2 = id.nextInt();
        list.removeFirst();
        System.out.println("Список после удаления элемента с головы : " + list.toString());
        System.out.println("Введите любую цифру для продолжения");
        int contin3 = id.nextInt();
        list.removeLast();
        System.out.println("Список после удаления последнего элемента : " + list.toString());
        System.out.println("Введите любую цифру для продолжения");
        int contin4 = id.nextInt();
        list.remove(2);
        System.out.println("Список после удаления указанного 3 элемента: " + list.toString());//вывод возвращается строка

    }

    // Узел списка
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    // Первый элемент списка
    private Node head;

    // Ввод с головы списка
    public void createHead() {
        Scanner scanner = new Scanner(System.in);
        int data;
        do {
            System.out.print("Введите значение для ввода с головы (для завершения введите 0): ");
            data = scanner.nextInt();
            if (data != 0) {
                addFirst(data);
            }
        } while (data != 0);
    }

    // Ввод с хвоста списка
    public void createTail() {
        Scanner scanner = new Scanner(System.in);
        int data;
        do {
            System.out.print("Введите значение для ввода с конца(для завершения введите 0): ");
            data = scanner.nextInt();
            if (data != 0) {
                addLast(data);
            }
        }while (data != 0);
    }
    // Вывод списка в строку
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }
    // Добавление элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Добавление элемента в конец списка
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Вставка элемента в список с указанным номером
    public void insert(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // Удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Удаление из списка элемента с указанным номером
    public void remove(int position) {
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}


