/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author ADMIN
 */
public class Stack {
      class Node {

        int data;

        public Node(int x) {
            this.data = x;
        }
    }
    int capacity;
    int lastIdx;
    Node[] arrayNode;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.arrayNode = new Node[capacity];
        this.lastIdx = -1;
    }
    boolean isEmpty() {
        return lastIdx == -1;
    }

    boolean isFull() {
        return lastIdx == capacity - 1;
    }

    void push(int x) {
        if (isFull()) {
            increaseCap();
        }
        arrayNode[++lastIdx] = new Node(x);
    }

    /* 
    write a funtion to pop the last element of the stack
    Dose it have a return value?
     */
    Node pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Node temp = arrayNode[--lastIdx];
            return temp;
        }
    }
    Node get() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Node temp = arrayNode[lastIdx];
            return temp;
        }
    }
    void increaseCap() {
        int newCap = (int) (capacity * 1.5);
        Node newArrayNode[] = new Node[newCap];
        for (int i = 0; i < arrayNode.length; i++) {
            newArrayNode[i] = arrayNode[i];
        }
        arrayNode = newArrayNode;
        capacity = newCap;
    } 
        void traverse() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            for (int i = 0; i <= lastIdx; i++) {
                System.out.print(arrayNode[i].data + "  ");
            }
            System.out.println();
        }
    }
}
