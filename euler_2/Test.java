
/**
 * This thing right here does some stuff.
 */
import java.util.*;
import java.util.ArrayList;
public class Test
{
    public static void main()
    {
       int Answer = sumMethod() + 2;
       System.out.println(Answer);
    }
   
    public static int sumMethod()
    {
        ArrayList<Integer> Multiples = new ArrayList<Integer>();
        Multiples.add(1);
        Multiples.add(2);
        int count = 1;
        int Test = 0;
        while (count <= 4000000) {
          int First = Multiples.get(Multiples.size()-2);
          int Second = Multiples.get(Multiples.size()-1);      
          int Third = First + Second;
          Multiples.add(Third);
          if (Third % 2 == 0) {
              Test += Third;
          }
          count = Multiples.get(Multiples.size()-1); 
        }
        return Test;
    }
}
