package View;

import PilhaInt.PilhaI;
import PilhaString.PilhaS;

public class TestesPilha {
	public static void main(String [] args) {
		PilhaI PI = new PilhaI();
		PilhaS PS = new PilhaS(); 
		
		PI.push((int) (Math.random()*100+1));
		PS.push("aoba");
		try {
			System.out.println(PI.pop());
			System.out.println(PS.pop());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
