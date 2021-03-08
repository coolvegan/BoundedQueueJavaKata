package com.kata.implemantation;

import com.kata.interfaces.ProcessInterface;
import com.kata.interfaces.RandomNumberInterface;


public class ReadImplementation implements ProcessInterface {
    private BoundedQueue<Integer> boundedQueue;
    private RandomNumberInterface<Integer> randomNumberInterface;
    public ReadImplementation(BoundedQueue<Integer> boundedQueue){
        if (boundedQueue == null){
            throw new RuntimeException("No Boundedqueue");
        }
        this.boundedQueue = boundedQueue;
    }
    @Override
    public void run() throws InterruptedException {
        randomNumberInterface = new MathRandomImpl();
        System.out.println(this.getClass().getName().toString()+">>ReadIteration");
        if (boundedQueue.Count() > 0 ){
            int number = boundedQueue.Dequeue();
            System.out.println(this.getClass().getName().toString()+" Dequeuing: "+number);
        }
        else{
            Thread.sleep(randomNumberInterface.get());
        }
    }
}
