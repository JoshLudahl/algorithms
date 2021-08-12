package problems.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInArrayTest {

    FindAllDuplicatesInArray dupes = new FindAllDuplicatesInArray();

    @Test
    void findDuplicates() {
        assertEquals(new ArrayList<>(Arrays.asList(2, 3)), dupes.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}