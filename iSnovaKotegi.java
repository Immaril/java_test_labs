package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Solution
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.print("Введите имя кота или оставьте пустым для завершения ввода: ");//мои дополнения
            String name = reader.readLine();
            System.out.println("");//мои дополнения
            if (name.isEmpty()) break;
            try//Весь блок try-catch
            {
                System.out.print("Введите возраст: ");
                int age = Integer.parseInt(reader.readLine());
                System.out.println("");
                System.out.print("Введите вес: ");
                int weight = Integer.parseInt(reader.readLine());
                System.out.println("");
                System.out.print("Введите длину хвоста: ");
                int tailLenght = Integer.parseInt(reader.readLine());
                System.out.println("");
                Cat cat = new Cat(name, age, weight, tailLenght ); // здесь добавил age, weight, tailLenght - конструктора с одним именем нет
                CATS.add(cat);
            }
            catch (NumberFormatException e)
            {
                System.out.print("Все значения, кроме имени, должны быть числовыми. Введите еще раз.");
                System.out.println("");
            }
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++)
        {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
