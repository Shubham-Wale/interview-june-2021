package exam;

import java.util.*;

public class ConvertToBinary {
 public String toBinary(final int n) {
    int m=n;
    if(m==0)
      {
          System.out.println("0000");
      }
     int[] binaryNum = new int[32];
        int i = 0;
        while (m > 0) {           
            binaryNum[i] = m % 2;
              m=m/2;
            i++;
        }
 
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    return "";
  }

  public static void main(String args[])
  {
      
      Scanner sc= new Scanner(System.in); 
      int n= sc.nextInt();  
      if(n>=0)
      {  ConvertToBinary b=new ConvertToBinary();
          b.toBinary(n);
      }
      else
      {
        throw new IllegalArgumentException("Enter positive numbers only");
      }
  }
}
