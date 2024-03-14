package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;
import java.lang.Math;

public class ListSorter {
    public void sort(List<String> sourceList) {
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);

        // Calculate the function value for x1 and x2
        int resultX1 = 5 * x1 * x1 + 3;
        int resultX2 = 5 * x2 * x2 + 3;

        if (resultX1 != resultX2) {
            return Integer.compare(resultX1, resultX2);
        } else {
            // If the function values are the same, sort based on x values
            return Integer.compare(x1, x2);
        }
    }
}
