import java.util.Scanner;  
public class test{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
   int segnum=sc.nextInt();
   int upbound= sc.nextInt();
   int[] upper = new int[segnum];
   int[] lower = new int[segnum];
   int[] lala = new int[upbound];

   int i =0;
   for(i=0;i<segnum;i++){
       lower[i] = sc.nextInt();
       upper[i] = sc.nextInt();
   }
   if((1<=segnum)&&(upbound<=100)){

                int cnt;
                int chalo=0;
   int x;
   for(x=1;x<=upbound;x++){
       cnt=0;
       for (i=0;i<segnum;i++){
           int l = lower[i];
           int u = upper[i];
           while(l!=u+1){
               if(x==l){
                   cnt++;
               }
               l++;
           }
           
       }
       if (cnt==0){
           chalo++;
           lala[chalo-1]=x;
           }
       
   }
   System.out.println(chalo);
           for(i=0;i<chalo;i++){
       System.out.print(lala[i]+" ");
               
           }
           
   } 
  
   sc.close();  
 }  
}
