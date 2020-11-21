  import java.util.Scanner;  
class piglatin{
    
    public static void main (String [] args){
       Scanner sc=new Scanner(System.in);
        String  num= sc.nextLine()+" ";
           String nnn="";
      int start =0;
        
        if(num.contains(" ")){
            
            for(int i=0; i < num.length(); i++){
           
                
                if(num.substring(i,i+1).equals(" ")){
           int end = i;
               
           nnn= nnn+num.substring(start+1,end);
       nnn= nnn+num.substring(start,start+1);
       nnn= nnn+"ay ";
                
                
            start = end+1; 
            
            
            
                
            } 
           
            
            
       
        }
     
     
    
     
   
    
    
    
        
        
    } else {
           nnn= nnn+num.substring(1,num.length());
       nnn= nnn+num.substring(0,1);
       nnn= nnn+"ay";
       
       
       
    
        
    }
    
    
    System.out.println(nnn);
    
}
}