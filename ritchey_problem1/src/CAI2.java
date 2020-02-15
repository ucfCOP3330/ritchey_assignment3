
import java.util.*;
import java.security.SecureRandom;



public class CAI2
{
    
    public static String correctResponse;
    public static String incorrectResponse;
    public static int practiceChoice;
    public static int difficultyLevel;
    public static int correctAnswer;
    
    public static void main(String args[])
    {
    	Scanner studentInput=new Scanner(System.in);
        //setDifficulty(studentInput);
        difficultyLevel = 1;
    	//setPracticeChoice(studentInput);
    	practiceChoice = 2;
        quiz(difficultyLevel,practiceChoice);
        studentInput.close(); 
    }

    public static String displayCorrectResponse (int randomNum)
    {
        
        switch(randomNum)
        
        {   
            case 1: 
                Random r1 = new Random();
                System.out.println(Quote.motivationQUOTES[r1.nextInt(Quote.motivationQUOTES.length)]);
            break;
        
            case 2: 
                Random r2 = new Random();
                System.out.println(Quote.motivationQUOTES[r2.nextInt(Quote.motivationQUOTES.length)]);
            break;
        
            case 3: 
                Random r3 = new Random();
                System.out.println(Quote.motivationQUOTES[r3.nextInt(Quote.motivationQUOTES.length)]);
            break;
        
            case 4: 
                Random r4 = new Random();
                System.out.println(Quote.motivationQUOTES[r4.nextInt(Quote.motivationQUOTES.length)]);
            break;
        }
        
    	
    	
        return correctResponse;
    }
    
    public static String displayIncorrectResponse (int randomNum)
    {
        
        switch(randomNum)
        
        {   
            case 1: 
                Random r1 = new Random();
                System.out.println(Quote.incorrectQUOTES[r1.nextInt(Quote.incorrectQUOTES.length)]);
            break;
    
            case 2: 
                Random r2 = new Random();
                System.out.println(Quote.incorrectQUOTES[r2.nextInt(Quote.incorrectQUOTES.length)]);
            break;
    
            case 3: 
                Random r3 = new Random();
                System.out.println(Quote.incorrectQUOTES[r3.nextInt(Quote.incorrectQUOTES.length)]);
            break;
    
            case 4: 
                Random r4 = new Random();
                System.out.println(Quote.incorrectQUOTES[r4.nextInt(Quote.incorrectQUOTES.length)]);
        }
        return incorrectResponse;
    }
    
    public static void setDifficulty(Scanner studentInput2)
    {
        System.out.println("Choose the difficulty level");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
       
        Scanner studentInput=new Scanner(System.in);
        difficultyLevel=studentInput.nextInt();
        
    }
    
    public static void setPracticeChoice(Scanner studentInput2)
    {
    	System.out.println("Math Practice");
        System.out.println("1 - Addition only");
        System.out.println("2 - Multiplication only");
        System.out.println("3 - Subtraction only");
        System.out.println("4 - Division only");
        System.out.println("5 - Random Mixture");
       
        Scanner studentInput=new Scanner(System.in);
        practiceChoice=studentInput.nextInt();
        
    }
    
    public int getDifficulty()
    {
        return difficultyLevel;
    }
    
    public String getIncorrect()
    {
        return incorrectResponse;
    }
    
    public String getMotivation()
    {
        return correctResponse;
    }
    
    public static double askQuestion()
    {
    	int a = 0;
    	int b = 0;
    	double answer2;
       switch(difficultyLevel)
         {
         case 1:
            if(difficultyLevel==1)
            {
              a=generateRandomNum(0,9);
              b=generateRandomNum(0,9);
            }
          case 2:
            if(difficultyLevel==2)
            {   
              a=generateRandomNum(0,99);
              b=generateRandomNum(0,99);
            }
          case 3:
            if(difficultyLevel==3)
            {
              a=generateRandomNum(0,999);
              b=generateRandomNum(0,999);
            }
          case 4:
            if(difficultyLevel==4)
            {
              a=generateRandomNum(0,9999);
              b=generateRandomNum(0,9999);
            }
         }
    	switch (practiceChoice)
    	{
    	case 1:
    		System.out.println("What is "+a+" plus "+b);
    		answer2 = a + b;
    		return answer2;
    	case 2:
    		System.out.println("What is "+a+" times "+b);
    		answer2 = a * b;
    		return answer2;
    	case 3:
    		System.out.println("What is "+a+" minus "+b);
    		answer2 = a - b;
    		return answer2;
    	case 4:
    		//System.out.println("What is "+a+" divided by "+b);	
    		if (a!=0 || b!=0)
    		{
    			System.out.println("What is "+a+" divided by "+b);
    			answer2 = a / b;
    			return answer2;
    		}
    		else if (a==0)
    		{
    			a++;
    			System.out.println("What is "+a+" divided by "+b);
				answer2 = a / b;
				return answer2;
    		}
			else if (b==0)
			{
				b++;
	   			System.out.println("What is "+a+" divided by "+b);
				answer2 = a / b;
				return answer2;
			}
    		//return answer2;
    	}
		return 0;
    }
    
    //The program shall generate random numbers with a SecureRandom object
    
    public static int generateRandomNum(int min, int max){
            
            SecureRandom rand = new SecureRandom();
            int x = (int)(rand.nextDouble()*((max-min)+1))+min;
            return x;
            }

   public static void quiz(int difficultyLevel,int practiceChoice)

   {
       int numOfAttempts=0;
       correctAnswer=0;
       switch (practiceChoice) {

            case 2:
                for(int i=1;i<=10;i++)
                {
                numOfAttempts+=multiplication(difficultyLevel);
                }
                break;

            
            default:
                System.out.println("Not a valid entry");

        }

       if ((correctAnswer*10)>=75) 
       {
    	   System.out.println("Your Score is " + (correctAnswer*10) + "%");
    	   System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
        	System.out.println("Your Score is " + (correctAnswer*10) + "%");
        	System.out.println("Please ask your teacher for extra help");
        }
    }

   public static int readResponse()
   {
	   Scanner studentInput=new Scanner(System.in);
	   int answer=studentInput.nextInt();
	   return answer;
   }
   
   
    public static void isAnswerCorrect(double answer2, int answer)
    {
    	while(answer != answer2)
        {
        	int incorrectString=generateRandomNum(1,4); 
            displayIncorrectResponse(incorrectString);
            answer=readResponse();    	
        }
    
        if(answer==answer2)
            {
        	  correctAnswer++;
          	  int motivationString=generateRandomNum(1,4);
              displayCorrectResponse(motivationString);
        	  System.exit(0);
            }
    }
    
     static int multiplication(int difficultyLevel)
   {            
       double answer2 = askQuestion();
       int answer=readResponse();
       isAnswerCorrect(answer2,answer);
       
       return answer;
     }
     
     static int division(int difficultyLevel)
     {            
         double answer2 = askQuestion();
         int answer=readResponse();
         isAnswerCorrect(answer2,answer);
         
         return answer;
       }
     
}