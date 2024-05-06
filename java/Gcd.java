import java.util.*;
class Main{
   public  int GCD(int number1, int number2) {
      if (number2 == 0) {
         return number1;
      }
      return GCD(number2, number1 % number2);
   }
}
public class Main {
   public static void main(String[] args) {
      int number_1 = 36;
      int number_2 = 24;
      Gcd gcdObject =  new Gcd();
      int gcd = gcdObject.GCD(number_1, number_2);
      System.out.println("G.C.D of "+" "+number_1+" & "+number_2 +" is: "+gcd);
      int lcm = (number_1 * number_2) / gcd;
      System.out.println("L.C.M of "+" "+number_1+" & "+number_2 +" is: "+lcm);
   }
}