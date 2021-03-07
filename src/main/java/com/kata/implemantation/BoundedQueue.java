package com.kata.implemantation;

import javax.xml.bind.Element;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;


public class BoundedQueue<T> {
    private final List<T> elements = new LinkedList();
    private int size;
    public BoundedQueue(int size){
        this.size = size;
    }
    void Enqueue(T Element){
        if (elements.size() < this.size){
            elements.add(Element);
        }

    }

    T Dequeue(){
        if (elements.size() > 0)
        {
            T element = elements.get(0);
            elements.remove(0);
            return element;
        }
        System.out.println("Nothing to dequeue");
        return null;
    }

    int Count(){
        return elements.size();
    }

    int Size(){
        return this.size;
    }

    public List<T> elements(){
        return this.elements;
    }
}
