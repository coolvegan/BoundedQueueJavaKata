package com.kata.implemantation;

import com.kata.implemantation.BoundedQueue;
import com.kata.interfaces.ProcessInterface;


public class WatchImplementation implements ProcessInterface {
    private final BoundedQueue<Integer> boundedQueue;
    public WatchImplementation(BoundedQueue<Integer> boundedQueue) {
        this.boundedQueue = boundedQueue;
    }

    @Override
    public void run() {

        System.out.println("=-=-=-=-=-=-=-=-=Elements in List-=-=-=-=-=-=-=-=-=-=-=");
        boundedQueue.elements().forEach((element)->{
            System.out.println("Element:"+element.toString());
        });
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
