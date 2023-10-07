import java.util.Scanner;
public class ProjectEliza 				/*            https://youtu.be/Di__iJrm59A               */
{
	static String [] wordsArray;
	static Scanner keyboard = new Scanner (System.in);

	
	
	//1------------------------------------------------------------------------------------------------------------------------1
	public static int wordCount(String s)                                 // Counts the words user inputed into a Sting sentence
	{
		int i = 0;
		int count = 0;
		while ( i<s.length())
		 {
			while (s.charAt(i)==' ') {if (i<s.length()-1) ++i; else return count;}
			 ++count;
			while (s.charAt(i)!=' ') {if (i<s.length()-1) ++i; else return count;}
		 }
		  return count;
	}
	//2------------------------------------------------------------------------------------------------------------------------2
	public static String [] stringToArray (String s)                       //Refers to an array of word elements inputed by user
	{
		wordsArray = new String [wordCount(s)];                            //usage of wordCouunt()
		for (int i = 0; i<wordsArray.length; ++i) wordsArray[i]="";        //initializing so they don't end up null "elements"
			int j = 0;
		 for (int i=0; i<wordsArray.length; ++i) 
		 {
				while (s.charAt(j)==' ') if (j<s.length()-1) ++j; else return wordsArray;
			
		        while (s.charAt(j)!=' ') 
			    {
				   {
					   wordsArray[i]=wordsArray[i]+s.charAt(j);    
					 if (j<s.length()-1) ++j; else return wordsArray;
				   } 
			    } 
		 }
		 return wordsArray;
	}
	//3------------------------------------------------------------------------------------------------------------------------3
	public static String inputString () {return keyboard.nextLine();}                       // Inputs keyboard input until ENTER
	//4------------------------------------------------------------------------------------------------------------------------4
	public static String firstWord () {return wordsArray[0] ;}       //returns the first word from input with a punctuation mark
	//5------------------------------------------------------------------------------------------------------------------------5
	public static String lasttWord ()                                   //returns last word user inputed with a punctuation mark 
	{						
		return wordsArray[wordsArray.length-1] ;
	}
	//6------------------------------------------------------------------------------------------------------------------------6
	public static String trimLastWord()                                //returns the last word without the last punctuation mark
	{
		if  (wordsArray[wordsArray.length-1].endsWith("?")) 
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('?',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith("!"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('!',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith("."))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('.',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith(","))  
	    {
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace(',',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
	    }
	if	(wordsArray[wordsArray.length-1].endsWith(";"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace(';',' ');	
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith(":"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace(':',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith("-"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('-',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith("<"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('<',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith(">"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('>',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if	(wordsArray[wordsArray.length-1].endsWith("/"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace('/',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	if  (wordsArray[wordsArray.length-1].endsWith(")"))  
		{
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].replace(')',' ');
		 wordsArray[wordsArray.length-1]=wordsArray[wordsArray.length-1].trim();
		}
	return wordsArray[wordsArray.length-1] ;
	}
	//7------------------------------------------------------------------------------------------------------------------------7
		public static String trimFirstWord()                          //returns the first word without the last punctuation mark
		{
			if  (wordsArray[0].endsWith("?")) 
			{
			 wordsArray[0]=wordsArray[0].replace('?',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith("!"))  
			{
			 wordsArray[0]=wordsArray[0].replace('!',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith("."))  
			{
			 wordsArray[0]=wordsArray[0].replace('.',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith(","))  
		    {
			 wordsArray[0]=wordsArray[0].replace(',',' ');
			 wordsArray[0]=wordsArray[0].trim();
		    }
		if	(wordsArray[0].endsWith(";"))  
			{
			 wordsArray[0]=wordsArray[0].replace(';',' ');	
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith(":"))  
			{
			 wordsArray[0]=wordsArray[0].replace(':',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith("-"))  
			{
			 wordsArray[0]=wordsArray[0].replace('-',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith("<"))  
			{
			 wordsArray[0]=wordsArray[0].replace('<',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith(">"))  
			{
			 wordsArray[0]=wordsArray[0].replace('>',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if	(wordsArray[0].endsWith("/"))  
			{
			 wordsArray[0]=wordsArray[0].replace('/',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		if  (wordsArray[0].endsWith(")"))  
			{
			 wordsArray[0]=wordsArray[0].replace(')',' ');
			 wordsArray[0]=wordsArray[0].trim();
			}
		return wordsArray[0] ;
		}
	//8------------------------------------------------------------------------------------------------------------------------8
	public static boolean endsOnExclamation (String s) {if (s.charAt(s.length()-1) == '!' ) return true; else return false;}
	//9------------------------------------------------------------------------------------------------------------------------9
	public static boolean endsOnQuestion (String s) {if (s.charAt(s.length()-1) == '?' ) return true; else return false;}
	//10-----------------------------------------------------------------------------------------------------------------------10
	public static boolean endsOnStatement (String s) 
	{if ((s.charAt(s.length()-1) != '?' )&&(s.charAt(s.length()-1) != '!' )) return true; else return false;}
	//11-----------------------------------------------------------------------------------------------------------------------11
	
 public static void main (String[ ] args) //--------------------------------------------------------------------------------MAIN
 {

	 PromptBank q = new PromptBank();				    //TESTING RANDOM STATEMENT OR QUESTION GENERATOR,
	 q.populateQuestionsArray();					    //BUT FIRST WE MUST POPULATE THE ARRAY OF STRINGS,
	 q.populateStatementsArray();					    //PRINT THEM OUT,
/*	 System.out.println(q.getRandomQuestionTrunk());    //INCASE ALL 5 LINES AS COMMENTS
	 System.out.println(q.getRandomStatementTrunk());   //  LATER IN DEVELOPEMENT .. THIS IS JUST A TEST
	 
	 String input;
	 String userName;
	 System.out.println("Hello, my name is Eliza. What is your name?");
	 userName = inputString ();
	 System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
	 input = inputString (); 
	 //System.out.println(wordCount(input));
	 String [] wordsArray = new String [wordCount(input)];
	 stringToArray (input);
	
	 for (int i = 0; i<wordsArray.length; ++i)  System.out.println(wordsArray[i]);    
	 
	 System.out.println(endsOnExclamation(lasttWord()));
	 System.out.println(endsOnQuestion(lasttWord()));
	 System.out.println(endsOnStatement(lasttWord()));		
	 System.out.println(wordCount(input));
	 System.out.println(firstWord ());
	 System.out.println( lasttWord());
	 System.out.println(trimLastWord());		*/
	 String output = "";
	 String input;
	 String userName;
	 boolean again = true;
	 
	 while (again)
	 {	 
	 System.out.println("Hello, my name is Eliza. What is your name?");
	 userName = inputString ();
	 System.out.println("Hello, " + userName + ". Tell me what is on your mind today in 1 sentence.");
	 
	 
	 //--------------------------------------------------------------------------------------------------OK HERE WE GO:
	 while (true)
	 {
	 
	  input = inputString (); 
	  
	 // String [] wordsArray = new String [wordCount(input)];
	  
	  stringToArray (input);
	  
	  if ((endsOnStatement(lasttWord())) && (!input.equals("EXIT")) )
		 {
			 output = q.getRandomStatementTrunk().replace("BLANK1", trimFirstWord());
			 output = output.replace("BLANK2", trimLastWord());
			 System.out.println(output);
		 }
	  
	 if ((endsOnQuestion (lasttWord()))  && (!input.equals("EXIT")) )
	 {
		output = q.getRandomQuestionTrunk().replace("BLANK1", trimFirstWord());
		 output = output.replace("BLANK2", trimLastWord());
		 System.out.println(output);
	 }
	 
	 if ((endsOnExclamation (lasttWord())) && (!input.equals("EXIT")) )
	 {
		 output = q.getRandomStatementTrunk().replace("BLANK1", trimFirstWord());
		 output = "WOW! Dramatic! " + output.replace("BLANK2", trimLastWord());
		 System.out.println(output);
	 }
	 
	
	 
	 //System.out.println(output);
	 
	 if (input.equals("EXIT")) 
	 {
	     do
	     {
		 System.out.println("Do you want to run the session again?");
		 input = inputString (); 
		 if (input.equals("Yes")||input.equals("yes")||input.equals("YES")||input.equals("yES")) {again = true; break;}
		 if (input.equals("No")||input.equals("no")||input.equals("NO")||input.equals("nO")) 
			 {
			 again = false;
			 System.out.println("Goodbye, until next time");
			 break;
			 }
	     }
		 while (!input.equals("Yes")&&(!input.equals("yes"))&&(!input.equals("YES"))&&
				 (!input.equals("yES"))&&(!input.equals("No"))&&(!input.equals("no"))&&
				 (!input.equals("NO"))&&(!input.equals("nO")));
	     break;
	 }
	 }
	 				/*						https://youtu.be/Di__iJrm59A							*/
	 } 
 }
}
