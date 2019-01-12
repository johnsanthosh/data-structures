package com.exj.queue;

import java.util.ArrayList;
import java.util.List;

class Queue {
    private List<Integer> list;
    private int start;

    Queue(){
        list = new ArrayList<Integer>();
        start = 0;
    }

    public void enQueue(int val){
        list.add(val);
        System.out.println(val + " was enqueued.");
    }

    public void deQueue(){
        if(!isEmpty()){
            System.out.println(list.get(start) + " was dequeued.");
            start++;
        }
    }

    public void display(){
        System.out.println();
        for(int i = start; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public boolean isEmpty(){
        if(start >= list.size()){
            System.out.println("The queue is empty");
            return true;
        }

        return false;
    }
}

public class QueueImpl {

    public static void main(String args[]){
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.display();
    }
}
