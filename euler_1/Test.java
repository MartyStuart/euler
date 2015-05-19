/**
 * This thing right here does some stuff.
 */
import java.util.*;
import java.util.ArrayList;
public class Test
{
    public static void main()
    {
    ArrayList<Integer> Three = new ArrayList<Integer>(sumMethod(3));
    ArrayList<Integer> Five = new ArrayList<Integer>(sumMethod(5));
    ArrayList<Integer> Answer = new ArrayList<Integer>(Three);
    Answer.addAll(Five);
    HashSet hs = new HashSet();
    hs.addAll(Answer);
    Answer.clear();
    Answer.addAll(hs);
    int sum = Answer.stream().mapToInt(Integer::intValue).sum();
    System.out.println(sum);
    }
    
    public static ArrayList<Integer> sumMethod(int Max)
    {
      int count = 1;
      ArrayList<Integer> Multiples = new ArrayList<Integer>();
      while (count < 1001) {
        int Testing = Max * count;
        if (Testing < 1000) {
          Multiples.add(Max * count);
        }
        count++;
      }
      return(Multiples);
    }
    
}