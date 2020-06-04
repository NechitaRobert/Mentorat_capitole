package PiatraHartieFoarfeca;

public class Arbitru {

	Persoane jucatorBot;
	Persoane jucatorPlayer;
	
	public Arbitru() {}
	public Arbitru(Persoane jucatorBot, Persoane jucatorPlayer) {
		this.jucatorBot = jucatorBot;
		this.jucatorPlayer = jucatorPlayer;
	}
	
	public static String alegereaCastigatorului(Persoane jucatorPlayer, Persoane jucatorBot) {
		
		String castigator = null;
			
		if (Persoane.jucatorPlayer.contains("foarfeca") && Persoane.jucatorBot.contains("piatra")) {
            return castigator = "Jucatorul a pierdut, piatra distruge foarfeca";
	    } else if (Persoane.jucatorPlayer.contains("piatra") && Persoane.jucatorBot.contains("foarfeca")) {
	    	return castigator = "Jucatorul a castigat, piatra distruge foarfeca";
	    }
		
		if (Persoane.jucatorPlayer.contains("hartie") && Persoane.jucatorBot.contains("piatra")) {
            return castigator = "Jucatorul a castigat, hartia inveleste piatra";
	    } else if (Persoane.jucatorPlayer.contains("piatra") && Persoane.jucatorBot.contains("hartie")) {
	    	return castigator = "Jucatorul a pierdut, hartia inveleste piatra";
	    }
		
		if (Persoane.jucatorPlayer.contains("foarfeca") && Persoane.jucatorBot.contains("hartie")) {
            return castigator = "Jucatorul a castigat, foarfeca taie hartia";
	    } else if (Persoane.jucatorPlayer.contains("hartie") && Persoane.jucatorBot.contains("foarfeca")) {
	    	return castigator = "Jucatorul a pierdut, foarfeca taie hartia";
	    }
		
		if (Persoane.jucatorPlayer.contains("foarfeca") && Persoane.jucatorBot.contains("foarfeca")) {
            return castigator = "E remiza";
	    } else if (Persoane.jucatorPlayer.contains("hartie") && Persoane.jucatorBot.contains("hartie")) {
	    	return castigator = "E remiza";
	    } else if (Persoane.jucatorPlayer.contains("piatra") && Persoane.jucatorBot.contains("piatra")) {
	    	return castigator = "E remiza";
	    }
		
	    return castigator;
	         
	}
}
		
		
			

