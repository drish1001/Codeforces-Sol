import java.util.Scanner;  
public class ScannerTest{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
   String x=sc.next(); 
   int y = x.length();
   if(y>=1&&y<=20)
   {
       y=((y+1)*26)-y;
       System.out.println(y);
   }
   sc.close();  
 }  
}
