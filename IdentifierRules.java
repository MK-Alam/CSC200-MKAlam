/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.

//class switch{
class Switch{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	
	/*
	R1 = Identifier can contain letters, digits, the underscore _ & dollar sign $
	R2 = Identifier cannot begin with a number
	R3 = Identifier names cannot contain whitespaces or special characters
	R4 = Reserved words cannot be used as identifier names
	R5 = Identifier names are case- sensitive
	*/
	
    //public static void 1start() { (R1)
    public static void start() { 
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {

        //int 2ndPlace = 2; (R2)
        int Place2nd = 2;

        //int first name = 10; (R3)
        int FirstName = 10;

        //int price# = 99; (R3)
        int Price = 99;
    	
    	//int user-name = 25; (R3)
    	int user_name = 25;

		//int class = 1; (R4)
		int klass = 1;
		
		//int double = 3; (R4)
		int TwoTimes = 3;

        int Score = 10;
        //System.out.println(score); (R5)
        System.out.println(Score);
		
		System.out.println("This program is executed after all errors are rectified.");


        //1start(); (R2)
        start();
    }

}
