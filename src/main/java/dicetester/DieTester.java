package dicetester;
import java.util.Scanner; 
import java.util.Arrays;

/**
 * @author Califf McBride 2-24-2022
 * This tester class models rolling various dice forms 
 */
public class DieTester 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //Creates a 6 sided die. Eventually this may become a local variable
        Die d = new Die (6);  
        int pointsSum = 0;
        int index = 0; //Tracks the index value for the dice array 
        //int[] diceArray = new int [6];
       
        System.out.println("How would you like to enter your ability score?");
        System.out.println("1-Sum of 3d6 ");
        System.out.println("2-Sum of best 3 of 5d6");
        System.out.println("3-Sum of best 3 5d6 plus 1d3");
        
        int Choice = input.nextInt();
        
        //This branch is the sum of 3d6
        if (Choice == 1)
        {
            int tries = 3;    //3 rolls of the dice 
            for (int i = 1; i <= tries; i++)
            {
              int n = d.cast();
              pointsSum = pointsSum + n;   //Total ability points avaliable 
              System.out.println(n + " "); //Prints each roll
            }
        }
        
        /**
         * Rolls a 6 sides die 5 times and stores the values in the array
         * Eventually I will figure out how to order the elements in the array
         */
        if (Choice == 2)
        {
           int tries = 5;
           int[] diceArray = new int [5];
           
           for (int i = 1; i <= tries; i++)
           {
              //Creating an array to store the dice rolls
              int n =d.cast();  //rolls the dice 
              //System.out.println(n);
              diceArray[index++] = n;  
            }
     
           //iterates through the array and prints each value 
           for (int i=0; i < index ; i ++)
           {
              //Prints all the dice values. Implemented here to test the method 
              System.out.println(" " + i +") " + diceArray[i]);
           }
           
           //Changes the numbers to strings and sorts them from smallest to largest
           Arrays.toString(diceArray);
           Arrays.sort(diceArray);
           pointsSum = diceArray[2]+diceArray[3]+diceArray[4];
        }
        
        if (Choice ==3)
        {
           int tries = 5;
           int[] diceArray = new int [5];
           
           for (int i = 1; i <= tries; i++)
           {
              //Creating an array to store the dice rolls
              int n =d.cast();  //rolls the dice 
              //System.out.println(n);
              diceArray[index++] = n;  
            }
     
           //iterates through the array and prints each value 
           for (int i=0; i < index ; i ++)
           {
              //Prints all the dice values. Implemented here to test the method 
              System.out.println(" " + i +") " + diceArray[i]);
           }
           
           //Changes the numbers to strings and sorts them from smallest to largest
           Arrays.toString(diceArray);
           Arrays.sort(diceArray);
           pointsSum = diceArray[2]+diceArray[3]+diceArray[4];
           
           tries = 1;
           Die d3 = new Die (3);
           int n = d3.cast();
           
           System.out.println("1 d3 roll= " + n);
           pointsSum = pointsSum + n;
        }
        //Prints the avalible points 
        System.out.println("You have " + pointsSum + " ability points to assign.");    
     }   
}
