package com.kata.implemantation;

import java.util.LinkedList;
import java.util.List;


public class ThreadPool {
    public ThreadPool(){
        System.out.println("Starte Threadpool");
    }
    List<Thread> threadList = new LinkedList<>();

    public void startAll(){
        threadList.forEach(Thread::start);
    }

    public void add(Thread thread){
        threadList.add(thread);
    }
}
