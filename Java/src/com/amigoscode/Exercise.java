package com.amigoscode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        // declare an empty integer array of length = 3
        // print the contents to the console

        int[] arrayOf3 = new int[3];

        Arrays.fill(arrayOf3,4);
        for(int pos: arrayOf3){
            System.out.println(pos);
        }

        Arrays.stream(arrayOf3).forEach(System.out::println);
        System.out.println(Arrays.toString(arrayOf3));

        // create a for loop which goes from 10 down to 0
        // print each value

        int[] arrayof10 = new int[10];
        Arrays.fill(arrayof10,1);

        for (int i = 9; i >=0 ; i--) {
            System.out.println("i: " + arrayof10[i]);
        }

        // create an array. Remember to manually set the size
        // create a for loop which goes from 0 to 10, adding each value to an array
        // print our array


        // create an array of n numbers
        // create a sum variable
        // create a loop
        // add each item to the sum value
        // outside the loop print the total sum

        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i : list){

        }
    }
}