package com.xouan.tree;

import java.util.Iterator;

public interface TreeIterator<T> {
    Iterator<T> getPreorderIterator();
    Iterator<T> getpostorderIterator();
    Iterator<T> getInorderIterator();
    Iterator<T> getLevelOrderIterator();
}
