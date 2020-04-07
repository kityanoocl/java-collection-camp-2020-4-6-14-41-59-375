package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(element -> element % 2 == 1).map(element -> element * 3 + 5).collect(Collectors.summingInt(Integer::intValue));
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList = arrayList.stream().filter(element -> element % 2 == 1).collect(Collectors.toList());
        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());
        evenList.addAll(oddList);
        return evenList;
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        if (specialElement % 2 == 1) return false;
        return arrayList.indexOf(specialElement) > 0;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(element -> {
            return (element % 2 == 1)? element * 3 + 2 : element;
        }).collect(Collectors.toList());
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(element -> element * 3 + 2).collect(Collectors.summingInt(Integer::intValue));
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int swap = leftBorder;
            leftBorder = rightBorder;
            rightBorder = swap;
        }
        return  Stream.iterate(leftBorder, n -> n + 1)
        .limit(rightBorder).filter(x -> x % 2 == 0).collect(Collectors.summingInt(Integer::intValue));
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int swap = leftBorder;
            leftBorder = rightBorder;
            rightBorder = swap;
        }
        return  Stream.iterate(leftBorder, n -> n + 1)
                .limit(rightBorder).filter(x -> x % 2 != 0).collect(Collectors.summingInt(Integer::intValue));
    }
}
