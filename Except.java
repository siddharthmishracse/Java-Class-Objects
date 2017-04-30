 import java.util.InputMismatchException;
    import java.util.Scanner;
    
    class ExceptT{
      
       public static int quotient( int a,int b)throws ArithmeticException{
          
          return a / b; 
       
       } 
    }
   
    class ExceptY{
    
       public static void main( String args[] ){

        ExceptT t = new ExceptT();

          Scanner sc = new Scanner( System.in ); 
          boolean continueLoop = true; 

          do                                                                  
          {                                                                   
             try                    
            {                                                                
                System.out.print( "Please enter an integer numerator: " );
                int a = sc.nextInt();                            
                System.out.print( "Please enter an integer denominator: " );
                int b = sc.nextInt();                          
                                                                              
                int result = t.quotient( a, b );

                System.out.printf( "\nResult: %d / %d = %d\n", a,  
                   b, result );                                     
                continueLoop = false; 

             } 

             catch ( InputMismatchException inputMismatchException )          
             {                                                                
                System.err.printf( "\nException: %s\n",                     
                   inputMismatchException );                                  
                sc.nextLine();

                System.out.println(                                           
                   "You must enter integers. Please try again.\n" );    
             } 

             catch ( ArithmeticException arithmeticException )                
             {                                                                
                System.err.printf( "\nException: %s\n", arithmeticException );
                System.out.println(                                           
                   "Zero is an invalid denominator. Please try again.\n" );
             }                                                   
          } while ( continueLoop );                         
       } 
     } 
