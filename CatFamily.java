public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String []catArray=new String[6];

        for(int i=0; i< catArray.length; i++)
            catArray[i]=reader.readLine();

        Cat gFather = new Cat(catArray[0],null,null);
        Cat gMother = new Cat(catArray[1],null,null);
        Cat Father= new Cat(catArray[2],null,catArray[0]);
        Cat Mother = new Cat(catArray[3],catArray[1],null);
        Cat Daughter = new Cat (catArray[4],catArray[3],catArray[2]);
        Cat Son = new Cat(catArray[5],catArray[3],catArray[2]);

        System.out.println(gFather);
        System.out.println(gMother);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Daughter);
        System.out.print(Son);
    }

    public static class Cat
    {
        private String name;
        private String mother;
        private String father;

        Cat(String name, String mother, String father )
        {
            this.name = name;
            this.mother = mother;
            this.father = father;
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
