package com.gabhi.pkg05.complextree;

public interface Tree<E extends Comparable> {
    boolean search(E toFind);
    void insert(E toInsert);
}
