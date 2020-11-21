class palindrome{
    
    public static void main( String [] args){
        
     String str="Eva, can I see bees in a cave?";
     String b="";
     String a="";
   str= str.toLowerCase();
        int i =0;
     for(i=str.length()-1; i>-1; i--){
       
         if(str.charAt(i)==' ' 	
|| str.charAt(i)=='?' || str.charAt(i)==','){
            } else {
       b=b+str.charAt(i);  }
    
        }
    
       for(i=0; i<str.length(); i++){
       
         if(str.charAt(i)==' ' 	
|| str.charAt(i)=='?' || str.charAt(i)==','){
            } else {
       a=a+str.charAt(i);  }
    
        }
        
        
  

       System.out.println(b);
       System.out.println(a);
if(b.equals(a)){
    System.out.println("true" );

  }


}
}