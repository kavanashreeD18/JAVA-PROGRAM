import java.io.*;
class Loop6
{
public static void main (String[] args)
{
int row = 1, coloumn =1;
int x;
do {
x=4;
do {
System.out.println("");
x--;
} while (x >= row);
coloumn = 1;
do {
System.out.println(coloumn + " " );
coloumn ++;
} while (coloumn <= 5);
System.out.println(" ");
row++;
} while (row <= 5);
}
}