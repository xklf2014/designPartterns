package com.story.designpatterns.strategy;

public class DogWeightCompartor implements Compartor_<Animal.Dog> {
    @Override
    public int compareTo(Animal.Dog o1, Animal.Dog o2) {
        if (o1.weight - o2.weight < 0) return -1;
        else if (o1.weight - o2.weight > 0) return 1;
        else return 0;
    }
}
