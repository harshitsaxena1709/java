public class pc{
    public static void main(final String args[]) {

      for (int index = 0; index < args.length; index++) {
          System.out.println("The value of index is:"+args[index]);
          
      }
            
      if(args.length>0){
          System.out.println("No of vlaues passed\t"+args.length);
      }
      else{
        System.out.println("Nothing Passed");
      }
      int value=args.length;
       
      while(value>0){
   System.out.println("while loop mein aa gye bhai !!   "+args[value-1]);
  value--;
      }
      

    }
}