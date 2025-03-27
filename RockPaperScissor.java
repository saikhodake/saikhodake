import java.util.Random;
//backend
public class RockPaperScissor
{
    //all of the choices that a computer can choose
    private static final String[] computerChoices={"Rock","Paper","Scissor"};
    
     public String getComputerChoice()
     {
        return computerChoice;
     }
     public int getComputerScore()
     {
        return computerScore;
     }
     public int getPlayerScore()
     {
        return playerScore;
     }
    //store the computer choice so that we can reterive the value and display it to the frontend
    private String computerChoice;

    //store the scores so that we can reterive the values and display it to the fronted
    private int computerScore,playerScore;
    //use to generate a random number to randomly choose an option for the computer
    private Random random;

    //constructor-to initialize random obj
    public RockPaperScissor() 
    {  
        random = new Random();
    }

    //call this method to begin playing rock paper scissor
    //playerChoice-is the choice madde by the player (i.e. rock ,pape ,or Scissor)
    //this method will return  the result of the game(i.e. computer win,player win,draw)
    public String playRockPaperScissor(String playerChoice)
    {
        //generate the computer Choice
        computerChoice=computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("ROCK"))
        {
            if(playerChoice.equals("Paper"))
            {
                result="Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Scissors"))
            {
                result="Computer Wins";
                computerScore++;
            }
            else
            {
                result="Drow";
            }
        }
        else  if(computerChoice.equals("Paper"))
        {
            if(playerChoice.equals("Scissors"))
            {
                result="Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Rock"))
            {
                result="Computer Wins";
                computerScore++;
            }
            else
            {
                result="Drow";
            }
    }
    else{
        //computer chooses scissors
        
            if(playerChoice.equals("Rock"))
            {
                result="Player Wins";
                playerScore++;
            }
            else if(playerChoice.equals("Paper"))
            {
                result="Computer Wins";
                computerScore++;
            }
            else
            {
                result="Drow";
            }
    }
    return  result;
    }
}