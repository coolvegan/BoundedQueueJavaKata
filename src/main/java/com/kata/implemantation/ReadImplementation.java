package com.kata.implemantation;

import com.kata.interfaces.ProcessInterface;


public class ReadImplementation implements ProcessInterface {
    private BoundedQueue<Integer> boundedQueue;
    public ReadImplementation(BoundedQueue<Integer> boundedQueue){
        if (boundedQueue == null){
            throw new RuntimeException("No Boundedqueue");
        }
        this.boundedQueue = boundedQueue;
    }
    @Override
    public void run() {
        System.out.println(this.getClass().getName().toString()+">>ReadIteration");
        if (boundedQueue.Count() > 0 ){
            int number = boundedQueue.Dequeue();
            System.out.println(this.getClass().getName().toString()+" Dequeuing: "+number);
        }
    }
}
