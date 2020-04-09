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
    //将当前节点cur的下一个节点 cur.getNext()缓存到temp后，然后更改当前节点指针指向上一结点pre。
    // 也就是说在反转当前结点指针指向前，先把当前结点的指针域用tmp临时保存，以便下一次使用
    public static Node reverse(Node head) {
        Node cur = head;
        Node myNext = null;

        while (cur!=null){
            Node nextTemp = cur.getNext(); //临时变量保存当前结点的下一个结点
            cur.next = myNext;             //将1指向myNext即指向空

            //指针移动
            myNext =cur;
            cur = nextTemp;


        }
        return  myNext;

    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
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
