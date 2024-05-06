import java.io.*;
class Ternaryl {
public static void main(String[]args)
{
  // variable declaration
    int n1 = 5, n2 = 10, res;

    System.out.println("First num: " + n1);
    System.out.println("Second num: " + n2);
  
   // performing ternary operation
    res = (n1 > n2) ? (n1 + n2) : (n1 - n2);


    // print the largest number
      System.out.println("Result =" + res);
}
}