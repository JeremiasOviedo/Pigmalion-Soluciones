package org.example;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        int[] nums1 = {1,4,3,9};
        int[] nums2 = {1,2,4,4};
        int requiredSum = 8;
        solucion1 solucion1 = new solucion1();
        solucion2 solucion2 = new solucion2();

        System.out.println("Solucion 1: ");
        System.out.println("Input: nums " + Arrays.toString(nums1) + " requiredSum = " + requiredSum);
        System.out.println("Output: " + solucion1.comprobarSumatoria(nums1,requiredSum));

        System.out.println("Input: nums " + Arrays.toString(nums2) + " requiredSum = " + requiredSum);
        System.out.println("Output: " + solucion1.comprobarSumatoria(nums2,requiredSum));


        System.out.println("///");

        System.out.println("Solucion 2: ");
        System.out.println("Input: nums " + Arrays.toString(nums1) + " requiredSum = " + requiredSum);
        System.out.println("Output: " + solucion2.comprobarSumatoria(nums1,requiredSum));

        System.out.println("Input: nums " + Arrays.toString(nums2) + " requiredSum = " + requiredSum);
        System.out.println("Output: " + solucion2.comprobarSumatoria(nums2,requiredSum));







    }
}