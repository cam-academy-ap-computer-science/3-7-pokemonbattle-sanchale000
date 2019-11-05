
/*Calls 3 methods
 * 	battlestart
 * 	damage
 * 	statstable
 *
 *	battlestart will
 *		print text
 *		accept name
 *		return name
 *
 *	damage will
 *
 * 
 */
import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		String name = battleStart();
		double hp = damage(name);
		statsTable(name, hp);
	}
	
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		System.out.print("Another trainer is issuing a challenge!\nZebstrika appeared.\nWhich pokemon do you choose? ");
		String name = console.next();
		System.out.print("You chose " + name + "!\nIt's a pokemon battle between " + name + " and Zebsrika!  Go!");
		return name;		
	}
	public static double damage(String name) {
		Scanner console = new Scanner(System.in);
		System.out.print("Zebstrika used Thunderbolt!\n\nTrainer, What are your " + name + "'s stats?\n");
		System.out.print("Level: ");
		double lvl = console.nextDouble();
		System.out.print("Attack: ");
		double att = console.nextDouble();
		System.out.print("Defense: ");
		double def = console.nextDouble();
		System.out.print("Base: ");
		double bas = console.nextDouble();
		System.out.print("STAB: ");
		double stab = console.nextDouble();
		System.out.print("HP: ");
		double hp = console.nextDouble();
		double mod = (0.85 + (Math.random() * 0.15)) * stab; 
		double dmg = Math.round(((((2 * lvl) + 10)/250) + ((att/def) * bas) + 2) * mod);
		double result = hp - dmg; 
		System.out.print(name + " sustained " + dmg + "points damge.\nHP, after damage, are now " + result + ".\n");
		return hp;
		
		
		
	}
	public static String statsTable(String name, double hp) {
		System.out.println("\nName   " + name);
		System.out.println("Level 	40");
		System.out.println("------------------------------");
		System.out.println("HP    	" + hp);
		System.out.println("ATTACK	52");
		System.out.println("DEFENSE   51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF   81");
		System.out.println("SPEED 	107");
		System.out.println("-------------------------------");
		return name;
		
		
		
	}

}
