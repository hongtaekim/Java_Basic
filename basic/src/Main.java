import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
    	 String answer = "";
    	 String code = "abc1abc1abc";
         int mode = 0;
         String ret = "";
         
         char arr[] = code.toCharArray();
         
         
         for( int idx=0; idx < arr.length; idx++)
         {
             if(mode == 0)
             {
                 if(  !(arr[idx]=='1')  )
                  {
                     if(idx % 2 == 0)
                     {
                        ret += arr[idx];
                     }
                  }
             else{
                 mode = 1;
                 
             	}
             }
         else{
             if(  !(arr[idx]=='1')  )
             {
                 if(idx % 2 != 0)
                 {
                      ret += arr[idx];
                 }
             }
             else{
                 mode = 0;
                 
             }
             
         }
         if(ret == "")
          {
             answer ="EMPTY";
          }
         	
         }
        
         
       
         
          System.out.println(ret);
        
    }
}