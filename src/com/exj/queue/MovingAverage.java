package com.exj.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    private Queue<Integer> q;
    private int size;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        if(q.size() >= this.size){
            q.poll();
        }
        q.offer(val);
        Iterator<Integer> iter = q.iterator();
        int sum = 0;
        while(iter.hasNext()){
            sum += iter.next();
        }

        return sum/q.size();
    }

    public static void main(String args[]){
        MovingAverage obj = new MovingAverage(3);
        obj.next(1);
        obj.next(10);
        obj.next(3);
        obj.next(5);
    }
}
