package com.story.designpatterns.strategy;

public class CatHeightCompartor implements Compartor_<Animal.Cat> {
    @Override
    public int compareTo(Animal.Cat o1, Animal.Cat o2) {
        if (o1.height - o2.height < 0) return -1;
        else if (o1.height - o2.height > 0) return 1;
        else return 0;
    }
}
