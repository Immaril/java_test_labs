import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Integer[] array=new Integer[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length;i++)
            array[i]=Integer.parseInt(reader.readLine());
        reader.close();
        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0; i<array.length;i++)
            System.out.println(array[i]);
    }
}
