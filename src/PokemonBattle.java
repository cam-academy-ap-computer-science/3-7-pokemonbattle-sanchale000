
/*
 * 
 */
import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		String name = battleStart();
	}
	
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		System.out.print("Another trainer is issuing a challenge!\nZebstrika appeared.\nWhich pokemon do you choose?");
		String name = console.next();
		System.out.print("You chose " + name + "!\nIt's a pokemon battle between " + name + " and Zebsrika!  Go!");
		return name;		
	}
	public static String damage(String name) {
		Scanner console = new Scanner(System.in);
		System.out.print("Zebstrika used Thunderbolt!\n\nTrainer, What are your " + name + "'s stats?");
		System.out.print("Level:");
		double lvl = console.nextDouble();
		System.out.print("Attack:");
		double att = console.nextDouble();
		System.out.print("Defense:");
		double def = console.nextDouble();
		System.out.print("Base:");
		double base = console.nextDouble();
		System.out.print("STAB:");
		double stab = console.nextDouble();
		System.out.print("HP:");
		double hp = console.nextDouble();
		double mod = (0.85 + Math.random() * 0.15) * stab; 
		double dmg = (((2 * lvl + 10)/250) + ((att/def) * base) + 2) * mod;
		hp = hp - dmg; 
		System.out.print(name + "sustained " + dmg + "points damge.\nHP, after damage, are now " + hp + ".");
		return hp;
		
		
		
	}

}
