package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return this.arrayList.stream().mapToInt(element -> element).average().getAsDouble();
    }


    public int getIndexOfFirstEven() {
        return this.arrayList.indexOf(this.arrayList.stream().filter(element -> element % 2 == 0).findFirst().orElse(null));
    }


    public int getLastOdd() {
        return this.arrayList.stream().reduce((lastOddNumber, element) -> lastOddNumber = (element % 2 == 1)? element : lastOddNumber).get();
    }



}
