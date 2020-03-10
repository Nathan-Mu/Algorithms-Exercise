package com.nathan.arrays;

import java.util.Arrays;

public class MyArray {
    private int realLength;
    private int originalLength;
    private int[] items;

    public MyArray(int length) {
        this.originalLength = length;
        this.items = new int[length];
    }

    public void insert(int item) {
        if (realLength >= items.length) {
            int[] temp = items;
            items = new int[realLength + 1];
            for (int i = 0; i < temp.length; i++) {
                items[i] = temp[i];
            }
        }
        items[realLength] = item;
        realLength++;
    }

    public void removeAt(int index) {
        int[] temp = items;
        if (realLength > originalLength) {
            items = new int[realLength - 1];
        }
        for (int i = 0; i < temp.length; i++) {
            if (i < index) {
                items[i] = temp[i];
            } else if (i > index) {
                items[i - 1] = temp[i];
            }
        }
        realLength--;
        if (realLength < originalLength) {
            items[index + 1] = 0;
        }
    }

    public int indexOf(int item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int item : items) {
            sb.append(item).append(",");
        }
        sb.deleteCharAt(sb.length() - 1).append("]");
        return sb.toString();
    }
}
