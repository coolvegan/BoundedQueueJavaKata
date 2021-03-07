package com.kata.implemantation;

import com.kata.interfaces.ProcessInterface;
import com.kata.interfaces.RandomNumberInterface;


public class WorkerThread extends Thread{
    private RandomNumberInterface<Integer> randomNumberInterface;
    private ProcessInterface processInterface;
    public WorkerThread(RandomNumberInterface randomNumberInterface, ProcessInterface processInterface){
        this.randomNumberInterface = randomNumberInterface;
        this.processInterface = processInterface;
    }
    public void run(){
        try {
            while(true) {
                int delay = this.randomNumberInterface.get();
                processInterface.run();
                System.out.println(this.getClass().getName().toString()+">>Sleep>>"+delay);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
