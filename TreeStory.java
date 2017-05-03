import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
      //--Name-- is a --adjective-- --noun--.  They are always --adverb-- --verb--.
        String ageString = console.readLine("How old are you?  ");
        int age = Integer.parseInt(ageString);
        if (age < 13) {
          // Insert exit code
          console.printf("Sorry, you are not old enough to use this program.\n");
          System.exit(0);
        }
        String name = console.readLine("Enter a name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String noun;
        boolean isInvalid;
      do {
        noun = console.readLine("Enter a noun:  ");
        //Treehouse challenge: Implement censorship to include contains and make words typed into lower case.
        isInvalid = (noun.contains("dork, jerk, nerd").toLowerCase);
//                    (noun.equalsIgnoreCase("dork") || 
//                     noun.equalsIgnoreCase("jerk") ||
//                     noun.equalsIgnoreCase("nerd"));
      if (isInvalid) {
         console.printf("Teasing is not allowed. Try again. \n\n");
        }
      } while(isInvalid);
        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter a verb ending with -ing:  ");
        
        console.printf("Your TreeStory. \n\n");
        console.printf("%s is a %s %s.  ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
    
}

// To run program: clear && javac TreeStory.java && java TreeStory