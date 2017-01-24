import java.util.Scanner;
// ref: geeksforgeeks

class SNode {
// works fine for now
    int data;
    SNode next;
    SNode(int d){
        data = d;
        next = null;
    }
}

public class StackUsingLinkedList {
    SNode top = null;

    void push(int val){
    // todo: optimize
    // reviewed
    // ref: stackoverflow
        SNode newNode = new SNode(val);
        newNode.next = top;
        top = newNode;
    }

    int pop(){
    // ref: geeksforgeeks
        if(top == null){
            System.out.println("stack underflow");
            // works fine for now
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if(top == null) return -1;
        return top.data;
    }

    void display(){
        SNode t = top;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("popped: " + s.pop());
        s.display();
        System.out.println("top: " + s.peek());
        // works fine for now
        // testing
    }
}
// ref: geeksforgeeks
// tested manually
// note: works for small inputs
