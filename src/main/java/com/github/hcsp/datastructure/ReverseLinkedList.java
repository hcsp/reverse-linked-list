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

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
        }
    }
    
     public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public class Solution {

	    public static void printReverse(LinkedListNode<Integer> root) {
        
        if(root==null){
            return ;
        }
        
        printReverse(root.next);
        System.out.print(root.data+" ");
        
	}

}
