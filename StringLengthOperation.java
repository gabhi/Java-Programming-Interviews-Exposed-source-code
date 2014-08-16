package com.gabhi.pkg07;

public class StringLengthOperation implements GenericOperation<String, Integer> {
    @Override
    public Integer performOperation(String value) {
        return value.length();
    }
}
