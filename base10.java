  import java.util.Scanner;  

class base10{

  public static void main(String[] Args){
       Scanner sc=new Scanner(System.in);
     String nnn="";
    ;
     int  num= sc.nextInt();
   
  

for(int i = 0; num > 0; i++){
  nnn= (num%2) + nnn;
  num=num/2;
    
    
}

 System.out.println(nnn);
 System.out.println("-");
}
}
