package com.nathan.arrays;

public class MyArraySolution {
    private int[] items;
    private int count;

    public MyArraySolution(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if the array is full, resize it
        if (items.length == count) {
            // create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set "items" to this new array
            items = newItems;
        }
        // add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }

    public int indexOf(int item) {
        // runtime complexity : O(n)
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(items[i]).append(",");
        }
        if (count > 0)
            sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}
