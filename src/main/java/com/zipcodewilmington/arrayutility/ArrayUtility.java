package com.zipcodewilmington.arrayutility;


/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {

    public T[] arr;

    public ArrayUtility(T[] inArr){
        this.arr = inArr;
    }
    public <T> Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if( arr[i].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public <T> Integer countDuplicatesInMerge(T[] mergeArray, T valueToEvaluate) {
        int count = 0;
        for (T t : mergeArray) {
            if (t.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count + getNumberOfOccurrences(valueToEvaluate);
    }

    public <T> T getMostCommonFromMerge(T[] arrayToMerge) {
        int count = 0;

        return null;
    }



    public T[] removeValue(T valueToRemove) {
        return null;
    }
}
