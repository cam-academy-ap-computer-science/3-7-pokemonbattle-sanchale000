
/*
 * 
 */
import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		String name = battleStart();
	}
	
	public static String battleStart() {
		System.out.print("Another trainer is issuing a challenge!\nZebstrika appeared.\nWhich pokemon do you choose?");
		Scanner console = new Scanner(System.in);
		String name = console.next();
		System.out.print("You chose " + name + "!\nIt's a pokemon battle between " + name + " and Zebsrika!  Go!");
		return name;		
	}

}
