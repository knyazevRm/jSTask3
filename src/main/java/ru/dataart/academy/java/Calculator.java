package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        int sum = 0;
        if (firstNumber.size() == 0 && secondNumber.size() == 0) {
            return sum;
        }
        int discharge = 1;
        for (int i = 0; i < firstNumber.size(); i++, discharge *= 10) {
            sum += firstNumber.get(i) * discharge;
        }

        discharge = 1;
        for (int i = 0; i < secondNumber.size(); i++, discharge *= 10) {
            sum += secondNumber.get(i) * discharge;
        }

        return sum;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i %2 == 0) {
                result.add(list.get(i));
            }
        }

        return result;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        // Task implementation
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        if (list.size() == 1) {
            return new ArrayList<>(list);
        }

        ArrayList<T> result = new ArrayList<>();
        result.add(list.get(0));
        result.add(list.get(list.size() - 1));

        return result;

    }
}
