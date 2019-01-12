package com.exj.queue;

import java.util.LinkedList;
import java.util.Queue;

class CircularQueue {
    private int arr[];
    private int size = 5;
    private int start = -1;
    private int end = -1;


    CircularQueue(){
        arr = new int[size];
    }

    private boolean isFull(){
        if((end+1)%size == start){
            System.out.println("The queue is full.");
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        if(start == end && start == -1){
            System.out.println("The queue is empty.");
            return true;
        }
        return false;
    }

    public void enQueue(int val){
        if(!isFull()){
            if(isEmpty()){
                start = 0;
            }
            end = (end + 1)%size;
            arr[end] = val;
            System.out.println(val + " was enqueued.");
        }
    }

    public void deQueue(){
        if(!isEmpty()){
            System.out.println(arr[start] + " was dequeued.");
            if(start == end){
                start = -1;
                end = -1;
            }else{
                start = (start + 1) % size;
            }
        }
    }
}

public class CircularQueueImpl {
    public static void main(String args[]){
        CircularQueue obj = new CircularQueue();
        obj.enQueue(1);
        obj.enQueue(2);
        obj.enQueue(3);
        obj.enQueue(4);
        obj.enQueue(5);
        obj.deQueue();
        obj.deQueue();
    }
}
