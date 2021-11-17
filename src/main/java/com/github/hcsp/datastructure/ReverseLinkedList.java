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
        if (head != null && head.next != null) {
            Node newHead = reverse(head.next); // 一通操作,就进入到了链表的倒数第二个元素
            head.next.next = head; // 把它的下一个元素设置成头节点
            head.next = null; // 再把头节点的下一个元素设置为空
            return newHead;
        }
        return head;
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
