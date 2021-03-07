package com.kata.implemantation;

import com.kata.interfaces.ProcessInterface;
import com.kata.interfaces.RandomNumberInterface;


public class WriterImplementation implements ProcessInterface {
    private RandomNumberInterface<Integer> randomNumberInterface;


    private BoundedQueue<Integer> boundedQueue;
    public WriterImplementation(BoundedQueue boundedQueue){
        this.boundedQueue = boundedQueue;
        randomNumberInterface = () -> {
            return 1;
        };
    }

    public void setNumberStrategy(RandomNumberInterface<Integer> randomNumberInterface){
        this.randomNumberInterface = randomNumberInterface;
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getName().toString()+">>WriteIteration");
        if (boundedQueue.Count() < boundedQueue.Size()){
            int random = randomNumberInterface.get();
            System.out.println(this.getClass().getName().toString()+">>Adding>>"+random);
            boundedQueue.Enqueue(random);
        }
    }
}
