/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2a1.choose.your.own.adventure;

/**
 *
 * @author Jalaw9578
 */
import java.util.Scanner;
public class U2A1ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedinput = new Scanner(System.in);
        System.out.println("Welcome to Derilect Dangers!");
        System.out.println("You find yourself upon a derilect space station");
        System.out.println("Do you go left or right, or not at all");
        String Input = keyedinput.nextLine();
        switch(Input) {
            case "left":
                System.out.println("You see a large cargo hold with many Cages, do you go towards them, or return the outside?");
                Input = keyedinput.nextLine();
                switch(Input) {
                    case "return outside":
                        System.out.println("You died to a passing asteroid");
                        Input = keyedinput.nextLine();
                break;
                    case "continue":
                        System.out.println("You see a large beast like creature, do you fight, or run?");
                        Input = keyedinput.nextLine();
                        switch(Input) {
                        case "fight":
                            System.out.println("The beast is intimidated by your flashlight, it runs away, but not before alerting its robotic keepers, do you hide or fight?");
                            Input = keyedinput.nextLine();
                            switch(Input) {
                            case "hide":
                                System.out.println("The robots can see you through walls!, you died.");
                            break;
                            case "fight":
                                System.out.println("You defeat the robots after a lengthy fight, you live to tell the tale and enjoy your newfound riches!");
                            break;      
                            }
                        break;
                        case "run":
                                System.out.println("it chased you down easily and you died");
                        break;      
                        }
                break;      
                }
        break;
            case "right":
                System.out.println("You find a pirate gang, you die");
        break;
            case "not at all":
                System.out.println("You died to a passing asteroid");
        break;        
        }
                
    }
    
}
