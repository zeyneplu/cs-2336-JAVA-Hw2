import java.util.*;
import java.lang.*;
import java.io.*;


/**
* Explain in a comment how your class is immutable:
* you cant update the string class after it is created, this makes it immutable
* 
**/

// WRITE YOUR CODE HERE
class MyString {

    // Constructor: create MyString from a char array
    public MyString(char[] chars);

    // Return the character at the given index
    public char charAt(int index);

    // Return the length of the MyString
    public int length();

    // Return a substring from begin (inclusive) to end (exclusive)
    // Returns a new MyString object
    public MyString substring(int begin, int end);

    // Convert all uppercase letters to lowercase
    // Returns a new MyString object
    public MyString toLowerCase();

    // Compare this MyString with another MyString
    public boolean equals(MyString s);

    // Convert an integer to a MyString
    public static MyString valueOf(int i);

    // Return a copy of the internal char array to maintain immutability
    public char[] toChars();
}


//FREEZE CODE BEGINS
class DriverMain {
    
    public static void main(String[] args){
      String str = null;
		  MyString s = null;
		  Scanner input = new Scanner(System.in);
		  int which = input.nextInt();
		  if(which!=6)
			  str = input.next();
		  switch (which) {
		    case 1 : // test length method
			    s = new MyString(str.toCharArray());
			    System.out.println(s.length());
			    break;
		    case 2 : // test charAt method
			    s = new MyString(str.toCharArray());
			    System.out.println(s.charAt(input.nextInt()));				
			    break;	
        case 3 : // test substring method, depends on toChars() to verify its content
          s = new MyString(str.toCharArray());
          System.out.println(new String(s.substring(input.nextInt(), input.nextInt()).toChars()));
          break;
        case 4 : // test equals method, depends on toChars() to verify its content
          String str2 = input.next();				
          s = new MyString(str.toCharArray());
          MyString s2 = new MyString(str2.toCharArray());
          System.out.println(s.equals(s2));
          break;
        case 5 : // test toLowerCase method, depends on toChars() to verify its content 
          s = new MyString(str.toCharArray());
          System.out.println(new String(s.toLowerCase().toChars()));
          break;
        case 6 : // test valueOf method, depends on toChars() to verify its content 
          System.out.println(new String(MyString.valueOf(input.nextInt()).toChars()));
          break;
        }
      }
    }
//FREEZE CODE ENDS
