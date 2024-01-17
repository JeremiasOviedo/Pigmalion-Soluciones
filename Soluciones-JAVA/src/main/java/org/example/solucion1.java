package org.example;

public class solucion1 {
    public boolean comprobarSumatoria(int[] nums, int requiredSum) {

        boolean response = false;
        int i = 0;
        int j = 1;

        while (!response && i < nums.length) {

            while (!response && j < nums.length) {

                if (nums[i] + nums[j] == requiredSum) {
                    response = true;
                } else {

                    j++;
                }
            }

            i++;
            j = i+1;
        }
        return response;

    }
}
