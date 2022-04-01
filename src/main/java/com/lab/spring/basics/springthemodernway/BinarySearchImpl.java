package com.lab.spring.basics.springthemodernway;

public class BinarySearchImpl {

    private SortAlgorithm algorithm;

    public BinarySearchImpl(SortAlgorithm algorithm) {
        super();
        this.algorithm = algorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortNumbers = algorithm.sort(numbers);

        System.out.println(algorithm);

        //Return the result
        return 3;

    }

}
