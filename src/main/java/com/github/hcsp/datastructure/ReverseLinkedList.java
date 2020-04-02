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
        print(reverse2(node1));
    }

    // 原地翻转一个单链表
    // 传递的参数是原始链表的头节点
    // 返回翻转后的链表的头节点
    //法一：使用纯指针，从前往后翻转
    //1->2->3->4->null     1->null   2->1->null ...
    public static Node reverse(Node head) {
        Node pre = null;
        Node cur = head;
        Node end = null;
        while (cur != null) {
            end = cur.next;
            cur.next = pre;
            pre = cur;
            cur = end;
        }

        return pre;
    }

    //法二：使用递归法
    //1->2->3->4->null
    //递归到最后一层时到达尾结点，将其设为新头节点
    //翻转当层递归下的节点，让新节点指向当层节点，当层节点指向空断链
    public static Node reverse2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
