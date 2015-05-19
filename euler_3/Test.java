/**
 * This thing right here does some stuff.
 */
import java.util.*;
import java.util.ArrayList;
public class Test
{
    public static void main()
    {
     
      long test = 600851475143L;
      
      for (long i = 1; i <= test; i++) {
        if(CheckPrime(i) != false && test % i == 0) {
          System.out.println(i);
        }
      }
      
    }
   static boolean CheckPrime(long findValue) {
      for (long i = 2; i < findValue; i++) {
        if (findValue % i == 0) {
          return false; 
        }
      }
      return true;      
   }
   
}