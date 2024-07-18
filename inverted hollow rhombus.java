
import java.util.*;

public class GeeksForGeeks {
    // Function to demonstrate pattern
    public static void printPattern(int n)
    {
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=n;j++){
            if(i==1 ||i==n || j==1 || j==n){
                System.out.print("  *");
            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println();    }
    }


    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
OUTPUT:
              *  *  *  *  *  *
            *              *
          *              *
        *              *
      *              *
    *  *  *  *  *  *

