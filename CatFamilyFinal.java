public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat []catArray=new Cat[6];

        catArray[0] = new Cat(reader.readLine(), null, null);
        catArray[1]=new Cat (reader.readLine(), null,null);
        catArray[2]=new Cat (reader.readLine(),catArray[0],null);
        catArray[3]=new Cat(reader.readLine(),null,catArray[1]);
        catArray[4]=new Cat (reader.readLine(),catArray[2],catArray[3]);
        catArray[5]=new Cat(reader.readLine(),catArray[2],catArray[3]);

        reader.close();

        for (Cat i:catArray)
            System.out.println(Arrays.toString(catArray));
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name, Cat mother, Cat father )
        {
            this.name = name;
            this.mother=mother;
            this.father=father;
        }

        @Override
        public String toString()
        {
            if ((mother != null) & (father != null))
                return "Cat name is " + name + " mother is " + mother + ", father is " + father;
            else
            {
                if ((mother == null)&(father==null))
                    return "Cat name is " + name + ", no mother "+", no father";
                else
                {   if (mother==null)
                    return "Cat name is " + name + ", no mother " + ", father is " + father;
                    else
                    return "Cat name is " + name + ", mother is " + mother + ", no father";
                }
            }
        }
    }

}
