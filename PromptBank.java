import java.util.Random;
public class PromptBank 						/*					https://youtu.be/Di__iJrm59A					*/
{
	private Random randGen = new Random();
	public String [] questions;
	public String [] statements;
	
	public PromptBank()
	{
		this.questions = new String[10]; //initialize your array to the correct length to match your number of questions you populate it with
		this.statements = new String[10]; //initialize your array to the correct length to match your number of statements you populate it with	
	}

	public void populateStatementsArray()
	{
		statements[0] = "Tell me more about BLANK1 and BLANK2.";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Let us explore the relation between BLANK2 and BLANK1.";
		statements[4] = "BLANK2 is obviously affecting BLANK1.";
		statements[5] = "Make sure that you don't confuse BLANK2 with BLANK1.";
		statements[6] = "BLANK2 complemented with the atributes of BLANK1 can be a powerful tool in your self-help toolkit.";
		statements[7] = "Try to separete BLANK1 from BLANK2 because that is often the case.";
		statements[8] = "If BLANK1 does't validate your feelengs, see if BLANK2 can be of help.";
		statements[9] = "When you say BLANK2, it seems like you're refering to BLANK1.";
	}
	public void populateQuestionsArray()
	{
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "What do You think is the connection between BLANK2 and BLANK1?";
		questions[4] = "Is BLANK2 affecting BLANK1 in any signifficant way?";
		questions[5] = "To unravel BLANK1, don't you think we must first dive into BLANK2?";
		questions[6] = "After hearing about BLANK1, can you tell me more about BLANK2?";
		questions[7] = "Why is it that BLANK2 always seems to follow BLANK1?";
		questions[8] = "When exactly did BLANK1 and BLANK2 become an item?";
		questions[9] = "Do you think that BLANK2 is bacause of BLANK1, or is it the other way arround?";	
	}
	 
	public String getRandomStatementTrunk() { return this.statements[randGen.nextInt(10)];}
	public String getRandomQuestionTrunk() { return this.questions[randGen.nextInt(10)];}
}					/*						https://youtu.be/Di__iJrm59A							*/
