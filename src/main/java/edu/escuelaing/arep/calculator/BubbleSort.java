package edu.escuelaing.arep.calculator;

import java.util.Comparator;
import java.util.List;

public class BubbleSort {

    public <T extends Comparable<T>> void  bubbleSort(List<T> arr) {
        int n = arr.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if ((arr.get(j).compareTo(arr.get(j+1))) > 0) {
                    T temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
    }
}
