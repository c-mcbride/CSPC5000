package characterrace;

/**
 *Tester class to demonstrate the functionality of the character race class 
 * @author Califf McBride CSPC5000 Group Project Written 3-28-2022
 */
public class CharacterRaceTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       CharacterRace myCharacter = new CharacterRace ();
       myCharacter.selectRace();
       myCharacter.displayRace();
    }
    
}
