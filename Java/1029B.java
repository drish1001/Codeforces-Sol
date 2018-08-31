import java.util.Scanner;  
public class test{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in); 
   int l= sc.nextInt();
   if(l>=1){
       int[] array= new int[l];
   int i,cnt,j=0,k,max=0,y=0;
   for(i=0;i<l;i++){
       array[i] = sc.nextInt();
   }
   cnt=1;
    for(k=1;k<l;k++){
        if(2*array[j]>=array[k]){
            cnt=cnt+1;
                  j=k;
                  y=cnt;

        }
        else {
            j=k;
            y=cnt;
            cnt=1;
        }
        if(y>max){
            max=y;
        }
    }
    if (max==0){
        max=1;
    }
   System.out.println(max);
       
   }
   
   sc.close();  
 }  
}
