package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map(element -> element * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map(element -> letters[element - 1]).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        Collections.sort(this.array, Collections.reverseOrder());
        return this.array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(this.array);
        return this.array;
    }
}
