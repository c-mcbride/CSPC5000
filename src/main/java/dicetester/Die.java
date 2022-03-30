package dicetester;
import java.util.Random; 

/**
 *
 * @author Califf McBride CSPC#5000 2-24-2022
 * This class creates a six sided die 
 */
public class Die 
{
    private Random generator; 
    private int sides; 
    
    /**
     * Constructs a die class with a number of sides and a random number
     * @param s the number of sides for the die
     */
    public Die (int s)
    {
        this.sides = s;
        generator = new Random();
    }
    
    /**
     * Method to roll the dice, it adds one to ensure zero is not a possibility 
     * @return the value of the dice roll using the number generator 
     */
    public int cast()
    {
        return 1 + generator.nextInt(sides); 
    }
    
    
    
}
