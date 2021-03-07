package com.kata;

import com.kata.implemantation.*;
import com.kata.interfaces.ProcessInterface;
import com.kata.interfaces.RandomNumberInterface;

public class App 
{
    public static void main( String[] args )
    {
        RandomNumberInterface randomNumberInterface = new RandomNumberImpl();
        BoundedQueue<Integer> boundedQueue = new BoundedQueue(5);

        ProcessInterface processInterface = new WriterImplementation(boundedQueue);
        ((WriterImplementation)(processInterface)).setNumberStrategy(randomNumberInterface);

        RandomNumberInterface randomNumberInterface1 = new RandomNumberImpl();

        WorkerThread readthread = new WorkerThread(randomNumberInterface1,new ReadImplementation(boundedQueue));
        WorkerThread writethread = new WorkerThread(new RandomNumberImpl(),processInterface);
        WorkerThread watchThread = new WorkerThread(() -> {return 1000;}, new WatchImplementation(boundedQueue));

        ThreadPool threadPool = new ThreadPool();
        threadPool.add(readthread);
        threadPool.add(writethread);
        threadPool.add(watchThread);
        threadPool.startAll();
    }
}
