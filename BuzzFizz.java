import java.util.*;

class BuzzFizz{

    public static void main(String args[])
    {
        ArrayList<String> arr= new ArrayList<>();
        arr=fizzBuzz(15);
        for(int i =0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList <String> arr = new ArrayList<>();
        for(int i =1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            arr.add("FizzBuzz");
            
            else if(i%3==0)
            arr.add("Fizz");

            else if(i%5==0)
            arr.add("Buzz");

            else
            arr.add(Integer.toString(i));
        }

        return arr;
    }
}