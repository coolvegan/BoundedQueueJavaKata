package com.kata.implemantation;

import com.kata.interfaces.RandomNumberInterface;

import java.security.SecureRandom;


public class RandomNumberImpl implements RandomNumberInterface {
    private final SecureRandom random = new SecureRandom();
    @Override
    public synchronized Object get() {
        int zeroToTenBothExclusive = random.nextInt(5000) + 1;
        return zeroToTenBothExclusive;
    }
}
