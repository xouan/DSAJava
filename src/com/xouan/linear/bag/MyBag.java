package com.xouan.linear.bag;

/** An interface that describes the operations of a bag of objects.*/

public interface MyBag<Item>{

    /** Gets the current number of items in this bag
     * @return The integer number of items in the bag*/
    int size();

    /** Sees whether this bag is empty
     * @return True if the bag is empty, or false if not. */
    boolean isEmpty();

    /** Adds a new item to this bag.
     * @param  item  The object to be added as a new item.
     * @return True if the addition is successful, or false if not. */
    boolean add(Item item);

    /** Removes one unspecified item from this bag, if possible.
     * @return Either the removed item, if the revoval was successful, or null.*/
    Item remove();

    /** Removes one occurence of a given item from this bag, if possible.
     * @param item The item to be removed.
     * @return True if the removal was successful, or false if not.*/
    boolean remove(Item item);

    /** Tests whether this bag contains a given item.
     * @param item The item to locate.
     * @return True if the bag contains item, or false if not.*/
    boolean contains(Item item);

    /** Removes all item from this bag.*/
    void clear();

    Item[] toArray();
}
