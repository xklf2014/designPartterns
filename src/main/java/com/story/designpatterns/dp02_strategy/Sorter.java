package com.story.designpatterns.dp02_strategy;

public class Sorter<T>{
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[minPos] < arr[j] ? minPos : j;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void sort(Animal.Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            int minPos = i;
            for (int j = i+1; j < cats.length; j++) {
                minPos = cats[minPos].compareTo(cats[j]);
            }
            swap(cats,i,minPos);
        }
    }

    private void swap(Animal.Cat[] arr, int i, int j) {
        Animal.Cat tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    // =================================下面========================================//
    public void sort(Comparable_[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[minPos].compareTo(arr[j]) == -1  ? minPos : j;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(Comparable_[] arr, int i, int j) {
        Comparable_ tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public void sort(Comparable_new[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[minPos].compareTo(arr[j]) == -1  ? minPos : j;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(Comparable_new[] arr, int i, int j) {
        Comparable_new tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void sort(T[] arr,Compartor_ compartor_) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = compartor_.compareTo(arr[minPos],arr[j]) == -1  ? minPos : j;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
