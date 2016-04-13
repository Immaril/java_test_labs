package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/


import static com.javarush.test.level05.lesson05.task05.Solution.Cat.fightCount;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1=new Cat("Murka",3,5,7);
        Cat cat2=new Cat("Durka",2,7,4);
        Cat cat3=new Cat("Kaurka",5,4,11);

        System.out.println("Round "+fightCount+"\n"+cat1.name+" VS "+cat2.name);
        if ((cat1.fight(cat2)))
            System.out.println(cat1.name+" wins!");
        else
            System.out.println(cat2.name+" wins!");
        System.out.println();

        System.out.println("Round "+fightCount+"\n"+cat1.name+" VS "+cat3.name);
        if ((cat1.fight(cat3)))
            System.out.println(cat1.name+" wins!");
        else
            System.out.println(cat3.name+" wins!");
        System.out.println();

        System.out.println("Round "+fightCount+"\n"+cat2.name+" VS "+cat3.name);
        if ((cat2.fight(cat3)))
            System.out.println(cat2.name+" wins!");
        else
            System.out.println(cat3.name+" wins!");
        System.out.println();
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 1;
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
