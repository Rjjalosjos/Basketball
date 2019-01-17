
package quiz;
import java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args) { 
        Scanner reader = new Scanner(System.in);
        Team teamofUser = new Team("Blank");
        int display = 0;
        
        System.out.println("Welcome to the basketball roster maker my Rjjalosjos!!"); 
        System.out.println("");
        System.out.println("Create a team that consists 5 to 15 players");
        System.out.println("");
        System.out.print("Enter a team name: ");
        String teamname = reader.nextLine();
        teamofUser.renameTeam(teamname);
        
        boolean loop = false; 
        
        while (loop != true ) 
        {
         showOptions();
         String letterOption = reader.nextLine();
            if (letterOption.equals("A")) {
                for (int i = 0; i < 1; i++) {
                   
                    if (display < 15) {
                    System.out.print("Last name of the player: ");
                    String lastname = reader.nextLine();
                    System.out.print("Jersey number of the player: ");
                    String jerseyinput = reader.nextLine();
                    System.out.print("Alias Name of the player: ");
                    String aliasname = reader.nextLine();
                    
                    teamofUser.AddPlayer(lastname, jerseyinput, aliasname);
                        System.out.println("");
                        System.out.println("Player added!");
                        System.out.println("");
                        display++;
                        
                    }
                   else {
                        System.out.println("");
                    System.out.println("Can't add, Team Full!");
                        System.out.println("");
                } 
                }
                
            }
            
         
            if (letterOption.equals("B")) {
                if (display >= 5) {
                     teamofUser.Display();
                }
                else {
                    System.out.println("");
                    System.out.println("Can't Display. You lack players!");
                    System.out.println("");
                }
                                  
            }
            
            if (letterOption.equals("C")) {
                teamofUser.showteamName();
            }
            
            if (letterOption.equals("D")) {
                System.out.print("Enter Jersey number of player: ");
                String jerseynum = reader.nextLine();
                teamofUser.findPlayer(jerseynum);
            }
            
            if (letterOption.equals("E")) {
                System.out.println("");
                System.out.println("");
                System.out.println("Thank you, have a good day!");
                loop = true;
            }
        }
        
            // hi sir.. i-perfect mo na to pls parang awa mo na
    }
   
    public static void showOptions() {
        System.out.println("Pick an option");
        System.out.println("A = Add Player (Up to 15 players only) ");
        System.out.println("B = Display Players (Can't display if players are below 5) ");
        System.out.println("C = Display team Name");
        System.out.println("D = find a player by jersey number");
        System.out.println("E = Exit");
        System.out.print("Type the letter of your option: ");
    }
    
   
    
}

