package co.grandcircus.lists;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {

    public static void main(String[] args) {
        int[] count = {2, 1, 3, 6, 3, 4, 5, 2, 0, 8, 8, 9, 5};
        Map<Integer, Integer> countValues = new HashMap<>();
        int value;
        
        for(int i : count) { 
            value = 0; 
            if(!countValues.containsKey(i)) { 
                countValues.put(i, 1); 
            }
            else if(countValues.containsKey(i)) { 
                value = countValues.get(i) + 1; 
                countValues.put(i, value); 
                
            }
        }
        
        for(int j : countValues.keySet()) { 
            System.out.printf("[%2d]: %-2d\n", j, countValues.get(j));
            
        }
        
        
    }
}
