package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        //System.out.println("Hello World!");
        //put items on the stack
        stack.push("Jack");
        stack.push("Queen");
        stack.push("King");
        stack.push("Ace");

        //sout
        System.out.println("Stack=>" + stack);
        System.out.println("++++++");


        //pop or remove from stack
        String card = stack.pop();
        System.out.println(card);
        System.out.println("New Stack =>" + stack);
        System.out.println("++++++++");

        //peep at the top of the stack w/o removing
        card = stack.peek();
        System.out.println(card);
        System.out.println("New Stack =>" + stack);
        System.out.println("++++++++");

        //use peek to see if you want to gather more numbers or use math on the post fix calculator

        System.out.println("IS this stack empty? " + stack.empty());
        System.out.println("What is the stack size? " + stack.size() );


        Collections.shuffle(stack);
        //queues

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        //print the queue
        System.out.println("The queue: " + queue);
        System.out.println("++++++++");

        //remove an item for the head of the queue

        int item = queue.remove();
        System.out.println(item);
        System.out.println("The new queue: " + queue);
        System.out.println("++++++++");

        //peek at the head of the queue
        item = queue.peek();
        System.out.println(item);
        System.out.println("The new queue: " + queue);
        System.out.println("++++++++");

        //we could also see the size of the queue like the stack

        item = queue.size();
        System.out.println(item);
        System.out.println("The size is: " + item);
        System.out.println("The new queue is: " + queue);
        System.out.println("++++++++");

        //insert into the queue

        ((LinkedList<Integer>) queue).add(1, 42);
        System.out.println(item);
        System.out.println("The new queue: " + queue);
        System.out.println("++++++++");
        // the queue works a bit easier than an array if there are multiple indexes because it allows the user to insert numbers a lot easier





    }
}
