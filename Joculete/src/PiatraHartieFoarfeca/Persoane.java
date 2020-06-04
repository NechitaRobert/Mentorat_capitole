package PiatraHartieFoarfeca;

import java.util.Random;
public class Persoane {

	public static String jucatorPlayer;
	public static String jucatorBot;
	
	public Persoane() {}
	public Persoane(String jucatorPlayer, String jucatorBot) {
		Persoane.jucatorPlayer = jucatorPlayer;
		Persoane.jucatorBot = jucatorBot;
	}
	
	public static String getJucatorPlayer() {
		return jucatorPlayer;
	}
	public static void setJucatorPlayer(String jucatorPlayer) {
		Persoane.jucatorPlayer = jucatorPlayer;
	}
	
	
	public static String getJucatorBot() {
		return jucatorBot;
	}
	public static void setJucatorBot(String jucatorBot) {
		Persoane.jucatorBot = jucatorBot;
	}
	
		
	public static String alegereaJucatorului(int elementeleDeSelectie) {
		if (elementeleDeSelectie == 1) {
			return Persoane.jucatorPlayer = "piatra";
		} else if (elementeleDeSelectie == 2) {
			return Persoane.jucatorPlayer = "hartie";
		} else if (elementeleDeSelectie == 3) {
			return Persoane.jucatorPlayer = "foarfeca";	
		}
		return Persoane.jucatorPlayer;
	}
	
	public static String alegereaBotului (Persoane jucatorBot) {
		Random aleator = new Random();
		int elementeleDeSelectie = aleator.nextInt(3) + 1;
		if (elementeleDeSelectie == 1) {
			Persoane.jucatorBot = "piatra";
		} else if (elementeleDeSelectie == 2) {
			Persoane.jucatorBot = "hartie";
		} else if (elementeleDeSelectie == 3) {
			Persoane.jucatorBot = "foarfeca";
		}
		System.out.println("Calculatorul a ales");
		return Persoane.jucatorBot;
	}
	

	
}
