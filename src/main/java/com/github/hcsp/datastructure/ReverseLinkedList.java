package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;

        print(node1);
        print(reverse(node1));
    }

    // 原地翻转一个单链表
    // 传递的参数是原始链表的头节点
    // 返回翻转后的链表的头节点
    public static Node reverse(Node head) {
        ArrayList<Node> nodes = new ArrayList<>();
        Node currentNode = head;
        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }
        for (int i = nodes.size() - 1; i >= 0; i--) {
            if (i == 0) {
                nodes.get(i).next = null;
                break;
            }
            nodes.get(i).next = nodes.get(i - 1);

        }
        return nodes.get(nodes.size() - 1);

    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
    }
}
