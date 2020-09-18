package com.story.designpatterns.dp02_strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,7,8,6,1,2,4,5};
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

        Animal.Cat cat1 = new Animal.Cat(5,5);
        Animal.Cat cat2 = new Animal.Cat(1,1);
        Animal.Cat cat3 = new Animal.Cat(7,7);
        Animal.Cat[] cats = {cat1,cat2,cat3};
        sorter.sort(cats);
        System.out.println(Arrays.toString(cats));

        Animal.Dog dog1 = new Animal.Dog(5,5);
        Animal.Dog dog2 = new Animal.Dog(1,1);
        Animal.Dog dog3 = new Animal.Dog(7,7);
        Animal.Dog[] dogs = {dog1,dog2,dog3};
        sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));


        Animal.Snake snake1 = new Animal.Snake(300);
        Animal.Snake snake2 = new Animal.Snake(200);
        Animal.Snake snake3 = new Animal.Snake(100);
        Animal.Snake[] snakes = {snake1,snake2,snake3};
        sorter.sort(snakes);
        System.out.println(Arrays.toString(snakes));

        Animal.Shark shark1 = new Animal.Shark(3000);
        Animal.Shark shark2 = new Animal.Shark(2000);
        Animal.Shark shark3 = new Animal.Shark(1000);
        Animal.Shark[] sharks = {shark1,shark2,shark3};
        sorter.sort(sharks);
        System.out.println(Arrays.toString(sharks));

        Animal.Dog dog4 = new Animal.Dog(5,5);
        Animal.Dog dog5 = new Animal.Dog(1,1);
        Animal.Dog dog6 = new Animal.Dog(7,7);
        Animal.Dog[] dogs1 = {dog4,dog5,dog6};
        sorter.sort(dogs1,new DogWeightCompartor());
        System.out.println(Arrays.toString(dogs1));

        Sorter<Animal.Cat> sorter1 = new Sorter<>();
        Animal.Cat cat4 = new Animal.Cat(15,5);
        Animal.Cat cat5 = new Animal.Cat(11,1);
        Animal.Cat cat6 = new Animal.Cat(17,7);
        Animal.Cat[] cats1 = {cat4,cat5,cat6};
        sorter1.sort(cats1,new CatHeightCompartor());
        System.out.println(Arrays.toString(cats1));

        Animal.Cat cat7 = new Animal.Cat(15,5);
        Animal.Cat cat8 = new Animal.Cat(11,1);
        Animal.Cat cat9 = new Animal.Cat(17,7);
        Animal.Cat[] cats2 = {cat4,cat5,cat6};
        sorter1.sort(cats2,(o1,o2)->{
            Animal.Cat c1 = (Animal.Cat) o1;
            Animal.Cat c2 = (Animal.Cat) o2;
            if (c1.height < c2.height) return 1;
            else if (c1.height > c2.height) return -1;
            else return 0;
        });
        System.out.println(Arrays.toString(cats2));
    }
}
