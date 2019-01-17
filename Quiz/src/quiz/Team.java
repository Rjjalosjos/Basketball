/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    Scanner reader  = new Scanner(System.in);
    public int teamSize = 15;
    public int teamNumber = 0;
    public String teamName;
    private ArrayList<String> lastName = new ArrayList<String>();
    private ArrayList<String> jerseyNumber = new ArrayList<String>();
    private ArrayList<String> codeName = new ArrayList<String>();
    
    public Team (String teamname) {
        this.teamName = teamname;
    } 
    
    
    public void AddPlayer (String lastname, String jerseynum, String codename) {
         
        this.lastName.add(lastname);
       this.jerseyNumber.add(jerseynum);
       this.codeName.add(codename);
      
    }
    
    public void showteamName () {
        System.out.println("");
        System.out.println("The team name is: " + teamName);
        System.out.println("");
    }
    
    public void renameTeam(String changename) {
        this.teamName = changename;
     }

    public void findPlayer(String jerseynum) {
        
        if (this.jerseyNumber.contains(jerseynum)){ 
            int index = jerseyNumber.indexOf(jerseynum);
            System.out.println("");
            System.out.print("Player " + (index+1) + ":" + lastName.get(index));
            System.out.print(", Number " + jerseyNumber.get(index) );
            System.out.print(" , " + codeName.get(index));
            System.out.println(" , Team: " + teamName);
            System.out.println("");
        }
        else {
            System.out.println("");
            System.out.println("Player not found");
            System.out.println("");
        }
    }
    
    public void Display() {
        
            
        
            for (int i = 0; i < lastName.size(); i++){
                System.out.println("");
            System.out.print("Player " + (i+1) + ":" + lastName.get(i));
            System.out.print(", Number " + jerseyNumber.get(i) );
            System.out.print(" , " + codeName.get(i));
            System.out.println(" , Team: " + teamName);
            System.out.println("");
             
                    
            }
            
        }
        
    }
    

