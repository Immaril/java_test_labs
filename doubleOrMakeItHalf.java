package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        
        while(true)
        {
            if (reader.readLine().isEmpty()) break;
            list.add(reader.readLine());
        }
        
        list=fix(list);

        for (String s : list)
            System.out.println(s);

    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        int i=0;
        while (i<list.size())
        {
            if ((list.get(i).contains("р")&&(list.get(i).contains("л"))))
                i++;
            else
            {
                if (list.get(i).contains("р"))
                list.remove(i);
                else
                    if (list.get(i).contains("л"))
                    {
                        list.add(i+1, list.get(i));
                        i+=2;
                    }
            }
        }
        return list;

    }
}