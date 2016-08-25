import java.util.Scanner;

public class ModulusPractice
	{
    static String name;
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
			    System.out.println("What is your name?");
			    name = userInput.nextLine();
			    System.out.println("Hello, " + name + "!");
			    //c1();
			   //c2();
			    c3();
			}
		
       public static void c1(){
    	   System.out.println("Please give me a number.");
    	   Scanner userInput = new Scanner(System.in);		    
    	   int number = userInput.nextInt();
    	   if (number%2 == 0){
    		   System.out.println("It is an even number, " + name + ".");
    	   } else {
    		   System.out.println("It is an odd number, " + name + ".");
    	   }
       }
       
       public static void c2(){
    	   System.out.println("Please give me a year.");
    	   Scanner userInput = new Scanner(System.in);		    
    	   int number = userInput.nextInt();
    	   if ((number%100 == 0) && (number%400 != 0)){
    		   System.out.println("It is a normal year, " + name + ".");
    	   } else if (number%4 == 0){
    		   System.out.println("It is a leap year, " + name + ".");
    	   } else {
    		   System.out.println("It is a normal year, " + name + ".");
    	   }
       }
       
       public static void c3(){
    	   int[] myArry = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20}; 
    	   for (int i = 0; i < myArry.length  )
       }
       
	}
