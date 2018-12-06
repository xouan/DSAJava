package com.xouan.tree;

import java.util.Iterator;

public interface TreeIteratorInterface<T> {
    Iterator<T> getPreorderIterator();
    Iterator<T> getpostorderIterator();
    Iterator<T> getInorderIterator();
    Iterator<T> getLevelOrderIterator();
}
