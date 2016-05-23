public class Solution
{
    String[] keys;
    String[] delimeters;

    public enum SwitchStatus
    {
        NoError, Error, ShowUsage
    }

    public void Solution(String[] a, String[] b)
    {
        this.keys = a;
        this.delimeters = b;
    }

    public void Solution(String[] a)
    {
        this.Solution(a, new String[]{"/", "-"});
    }

    public void OnUsage(String ErrorKeys)
    {
        if (ErrorKeys != null) System.out.println(ErrorKeys);
        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
        System.out.println(" -? показать Help файл");
        System.out.println(" -r задать имя входного файла");
        System.out.println(" -w выполнить вывод в указанный файл");
    }

    public SwitchStatus OnSwitch(String key, String keyValue)
    {
        System.out.println(key);
        System.out.println(keyValue);
        return SwitchStatus.NoError;
    }

    public boolean Parse(String[] args)
    {
        SwitchStatus ss = SwitchStatus.NoError;
        int argNum;
        for (argNum = 0; (ss == SwitchStatus.NoError) && (argNum < args.length); argNum++)
        {
            boolean isDelimeter = false;
            for (int n = 0; !isDelimeter && (n < delimeters.length); n++)
            {
                isDelimeter = args[argNum].regionMatches(0, delimeters[n], 0, 1);
                if (isDelimeter)
                {
                    boolean isKeys = false;
                    for (int i = 0; i < keys.length; i++)
                    {
                        isKeys = args[argNum].regionMatches(2, keys[i], 0, 1);
                    }
                    if (!isKeys) break;
                } else
                {
                    ss = SwitchStatus.Error;
                    break;
                }
            }
        }
        if (ss == SwitchStatus.ShowUsage) OnUsage(null);
        if (ss == SwitchStatus.Error) OnUsage((argNum == args.length) ? null : args[argNum]);
        return ss == SwitchStatus.NoError;
    }
    public static void main(String [] args)
    {
        Solution obj=new Solution(String []{"?","r","w"});// <------------- ВОТ ТУТ ВОТ КАКОЙ-ТО ПИЗДЕЦ, ПОТОМУ ЧТО Я НЕ ПОНИМАЮ, ЧТО ВООБЩЕ ОТ МЕНЯ ЖДЕТ ПРОГА.
        obj.Parse(???????????????????????????????????????????);
    }
}
