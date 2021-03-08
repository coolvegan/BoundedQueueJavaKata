package com.kata.implemantation;

import com.kata.interfaces.RandomNumberInterface;


public class NullDelayImplementation implements RandomNumberInterface {

    @Override
    public Object get() {
        return 0;
    }
}
