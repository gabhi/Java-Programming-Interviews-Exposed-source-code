package com.gabhi.pkg07;

public class AddOneOperation implements IntegerOperation {
    @Override
    public Integer performOperation(Integer value) {
        return value + 1;
    }
}
