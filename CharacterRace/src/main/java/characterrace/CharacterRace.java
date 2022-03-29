package characterrace;
import java.util.Scanner;

/**
 * 
 *
 * @author Califf McBride CSPC5000 Group Project
 */
public class CharacterRace 
{
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public String race;
    
    //All values are intiliazed to 10, later they will take values that the user selects
    public CharacterRace ()
    {
        this.strength = 10;
        this.dexterity = 10;
        this.constitution = 10;
        this.intelligence = 10;
        this.wisdom = 10;
        this.charisma = 10;
        this.race = null; 
    }
    
    public void selectRace ()
    {
      Scanner input = new Scanner (System.in);
      System.out.println("Please select your race: ");
      System.out.println("1-Human");
      System.out.println("2-Elf");
      System.out.println("3-Dwarf");
      System.out.println("4-Gnome");
      System.out.println("5-Halfling");
      int raceChoice = input.nextInt();
      
      /**
       * While loop to process the users input
       * once they have selected a race, the appropriate stat points are assigned 
       */
      while (true)
      {
          if (raceChoice == 1)
          {
            race = "human";
            break;
          }
          
          if (raceChoice == 2)
          {
              race = "Elf";
              dexterity = dexterity + 2;
              intelligence = intelligence + 2;
              constitution = constitution - 2;
              break;
          }
          
          if (raceChoice == 3)
          {
              race = "Dwarf";
              strength = strength + 2;
              constitution = constitution + 2;
              charisma = charisma - 2;
              break;
          }
          
          if (raceChoice == 4)
          {
              race = "Gnome";
              dexterity = dexterity + 2;
              constitution = constitution + 2;
              strength = strength - 2;
              break;
          }
          
          if (raceChoice == 5)
          {
              race = "Halfling";
              dexterity = dexterity + 2;
              wisdom = wisdom + 2;
              strength = strength - 2;
              break;
          }
      }        
    }
    
    //Displays the race along with the choosen stat points 
    public void displayRace ()
    {
     System.out.println ("Character race = " + race);
     System.out.println("strength = " + strength);
     System.out.println("dexterity = " + dexterity);
     System.out.println("constiution = " + constitution);
     System.out.println("intelligence = " + intelligence);
     System.out.println("wisdom = " + wisdom);
     System.out.println("charisma = " + charisma);
    }
             
}
