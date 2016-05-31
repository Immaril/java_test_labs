public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat[] catArray = new Cat[6];

        catArray[0] = new Cat(reader.readLine(), null, null);
        catArray[1] = new Cat(reader.readLine(), null, null);
        catArray[2] = new Cat(reader.readLine(), null, catArray[0]);
        catArray[3] = new Cat(reader.readLine(), catArray[1], null);
        catArray[4] = new Cat(reader.readLine(), catArray[3], catArray[2]);
        catArray[5] = new Cat(reader.readLine(), catArray[3], catArray[2]);

        reader.close();

        for (int i = 0; i < catArray.length; i++)
            System.out.println(catArray[i]);
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name, Cat mother, Cat father)
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            //return "Cat name is " + name + (mother.name == null ? ", no mother" : (", mother is " + mother.name)) + (father.name == null ? ", no father" : (", father is " + father.name));
            if ((mother.name != null) & (father.name != null))
                return "Cat name is " + name + " mother is " + mother.name + ", father is " + father.name;
            else
            {
                if ((mother.name == null) & (father.name == null))
                    return "Cat name is " + name + ", no mother " + ", no father";
                else
                {
                    if (mother.name == null)
                        return "Cat name is " + name + ", no mother " + ", father is " + father.name;
                    else
                        return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                }
            }
        }
    }
}
