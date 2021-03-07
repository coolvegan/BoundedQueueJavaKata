package com.kata.implemantation;

import com.kata.interfaces.RandomNumberInterface;


public class MathRandomImpl implements RandomNumberInterface {

    @Override
    public Object get() {
        int random_int = (int)(Math.random() * (4000 - 1 + 1) + 1);
        return random_int;
    }
}
