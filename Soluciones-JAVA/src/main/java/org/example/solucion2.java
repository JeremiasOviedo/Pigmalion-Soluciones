package org.example;

import java.util.HashMap;
import java.util.Map;

public class solucion2 {

    public boolean comprobarSumatoria(int[] nums, int requiredSum) {

        Map<Integer, Integer> mapNums = new HashMap<>();

        for (int num : nums) {
            mapNums.put(num, mapNums.getOrDefault(num, 0) + 1);
        }


        for (int num : nums) {

            int complement = requiredSum - num;

            if (complement == num && mapNums.get(num) > 1) {
                return true;
            }

            if (complement != num && mapNums.containsKey(complement)) {
                return true;
            }
        }
        return false;
    }
}
