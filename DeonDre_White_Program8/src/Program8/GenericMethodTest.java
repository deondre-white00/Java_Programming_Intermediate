package Program8;

//********************************************************************
//
//Developer:            Instructor
//
//Program #:            Nine
//
//File Name:            GenericMethodTest.java
//
//Course:               ITSE 2317 Intermediate Java Programming
//
//Due Date:             
//
//Instructor:           Fred Kumi 
//
//Chapter:              20
//
//Description:
//     Printing array elements using generic method printArray.
//
//********************************************************************

public class GenericMethodTest
{
 //***************************************************************
 //
 //  Method:       main
 // 
 //  Description:  The main method of the program
 //
 //  Parameters:   String array
 //
 //  Returns:      N/A 
 //
 //**************************************************************
 public static void main(String[] args)
 {
    // create arrays of Integer, Double and Character
    Integer[] integerArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
    Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.printf("Array integerArray contains: ");
    printArray(integerArray); // pass an Integer array
    System.out.printf("Sub of Array: ");
    printArray(integerArray, 1, 4); 
    System.out.printf("Array doubleArray contains: ");
    printArray(doubleArray); // pass a Double array
    System.out.printf("Sub of Array: ");
    printArray(doubleArray, 1, 5);
    System.out.printf("Array characterArray contains: ");
    printArray(characterArray); // pass a Character array
    System.out.printf("Sub of Array: ");
    printArray(characterArray, 1, 4);
 }

 // generic method printArray                     
 public static <T> void printArray(T[] inputArray)
 {
    // display array elements            
    for (T element : inputArray)
	  {       
       System.out.printf("%s ", element);
       
    }                                    

    System.out.println();
 } 
 
 public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript)
 {
		// display array elements
		if(lowSubscript < 0 || highSubscript >+ inputArray.length)
			throw new InvalidSubscriptException();
		
		int count = 0;
		
		for(int i = lowSubscript; i <= highSubscript; i++) {
			System.out.printf("%s ", inputArray[i]);
			count++;
		}

		
   
    System.out.println();
    return count;
 } 
 
 
 
} 