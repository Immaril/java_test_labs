import java.io.BufferedReader;
import java.io.InputStreamReader;


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
        int[] array=new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length;i++)
            array[i]=Integer.parseInt(reader.readLine());
        reader.close();
        reverse(array);
        printArray(array);
    }
    private static int[] reverse(int[] array)
    {
        int temp=0;
        for (int i=0; i<array.length/2;i++)
        {
            temp = array[i];
            array[i] = array[(array.length-1)-i];
            array[(array.length-1)-i]=temp;
        }
        return array;
    }
    private static void printArray(int[]array)
    {
        for (int i=0; i<array.length;i++)
            System.out.println(array[i]);
    }
}
