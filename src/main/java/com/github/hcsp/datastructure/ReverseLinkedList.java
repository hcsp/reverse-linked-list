package com.github.hcsp.datastructure;

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
        //1 -> 2 -> 3 -> null ----> null <- 1 <- 2 <- 3
        Node currentNode = head;
        Node preNode = null;
        Node tempNode;
        while (currentNode != null) {
            //保存下一个节点信息
            tempNode = currentNode.next;
            //将前一个节点信息保存到当前节点的下一个节点
            currentNode.next = preNode;
            //将当前节点作为前一个节点
            preNode = currentNode;
            //将储存的下一个节点信息作为当前节点
            currentNode = tempNode;
        }
        //当前节点信息为null，所以返回的应该是前一个节点
        return preNode;
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
