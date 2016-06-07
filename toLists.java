import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listMax = new ArrayList<>();

        int count = 0;

        for (int i = 0; i<5; i++)
            list.add(reader.readLine());
        reader.close();

        for (int i=0; i<list.size(); i++)
        {
            if (list.get(i).length() >= listMax.get(count).length())
                listMax.set(count,list.get(i));
            if (list.get(i).length() == listMax.get(count).length())
                count=count+1;
        }
        System.out.println(listMax);
    }
}
