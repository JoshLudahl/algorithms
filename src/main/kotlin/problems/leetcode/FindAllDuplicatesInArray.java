package problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        // Create return array
        List<Integer> list = new ArrayList<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {

            // Grab the absolute value of the value at the current index - 1, so we stay in bounds
            int index = Math.abs(nums[i]) - 1;

            // If the value is negative, we have seen this number before, add it to the list
            if (nums[index] < 0) list.add(index + 1);
            
            // Set the current value of the index to a negative number to show we've seen it
            nums[index] *= -1;
        }
        return list;
    }
}
