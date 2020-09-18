package com.story.designpatterns.dp02_strategy;

public class Animal {

    public static class Cat{
        int height,weight;

        public Cat(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public int compareTo(Cat cat){
            return cat.weight - cat.weight;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }


    public static class Dog implements Comparable_{
        int height,weight;

        public Dog(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Object o) {
            Dog d = (Dog)o;
            if (this.weight - d.weight < 0) return -1;
            else if (this.weight - d.weight > 0)return 1;
            else return 0;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "weight=" + weight +
                    '}';
        }
    }


    public static class Snake implements Comparable_{
        int food;

        public Snake(int food) {
            this.food = food;
        }

        @Override
        public int compareTo(Object o) {
            Snake s = (Snake)o;
            if (this.food - s.food < 0) return -1;
            else if (this.food - s.food > 0)return 1;
            else return 0;
        }

        @Override
        public String toString() {
            return "Snake{" +
                    "food=" + food +
                    '}';
        }
    }

    public static class Shark implements Comparable_new<Shark>{
        int food;

        public Shark(int food) {
            this.food = food;
        }

        @Override
        public String toString() {
            return "Shark{" +
                    "food=" + food +
                    '}';
        }

        @Override
        public int compareTo(Shark o) {
            return o.food - o.food;
        }
    }
}
