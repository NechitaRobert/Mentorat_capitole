package aplicatie;

public class Cursuri extends Institutie {

	
	private String matrice[][] = new String[30][3];
	
	public Cursuri() {}
	public Cursuri(String id[], String pret[], String denumire[], String matrice[][]) {
		super(id, pret, denumire);
		this.matrice[30][3] = matrice[pret.length + denumire.length + id.length][3];
	}
	
	@SuppressWarnings("unused")
	private String[][] getMatrice() {
		return this.matrice;
	}
	@SuppressWarnings("unused")
	private String[][] setMatrice(String[][] matrice) {
		return this.matrice = matrice;
	}
	
	public void cursuri(String id[], String pret[], String denumire[]) {
		
		for(int i = 0; i < id.length; i++) {
			matrice[i][0] = id[i];
		}
		for(int i = 0; i < pret.length; i++) {
			matrice[i][1] = pret[i];
		}
	    for(int i = 0; i < denumire.length; i++) {
	    	matrice[i][2] = denumire[i];
	    }
		
	    for(int i = 0; i < id.length; i++) {
	    	for (int j = 0; j < matrice[i].length ; j++) {
	    		System.out.print("[" + matrice[i][j] + "]");
	    	}
	    	System.out.println();
	    }
		
	}
	
//	private void cursuriProgramare(String id[], String pret[], String denumire[]) {
//		
//		String idProgramare[]       = new String [id.length -       ((id.length   - 1) / 2)];
//		String pretProgramare[]     = new String [pret.length -     ((pret.length - 1) / 2)];
//		String denumireProgramare[] = new String [denumire.length - ((denumire.length - 1))/2];
//		String cursProgramare[][]   = new String [15][3];
//		
//		
//		int iteratie = 0;
//		for (int i = ((id.length - 1)/2); i < id.length; i++ ) {
//			idProgramare[iteratie] = id[i];
//			iteratie++;
//		}
////		for (int i = 0; i < idProgramare.length; i++) {	
////			System.out.print("[" + idProgramare[i] + "]");
////	    }
//		
//		for (int i = 0; i < idProgramare.length; i++) {
//			cursProgramare[i][0] = idProgramare[i];
//		}
//		
//		for (int i = 0; i < idProgramare.length; i++) {	
//			for (int j = 0; j < cursProgramare[i].length ; j++) {
//				System.out.print("[" + cursProgramare[i][0] + "]");
//			}	
//	    }
//		
//		
//		for (int i = ((pret.length - 1)/2); i < pret.length; i++ ) {
//		pretProgramare[iteratie] = pret[i];
//	   	iteratie++;
//	    }
//		for (int i = 0; i < pretProgramare.length; i++) {
//			cursProgramare[i][1] = pretProgramare[i];
//		}
//		
//		
//		
//		for (int i = ((denumire.length - 1)/2); i < denumire.length; i++ ) {
//			denumireProgramare[iteratie] = denumire[i];
//			iteratie++;
//		}
//		for (int i = 0; i < denumireProgramare.length; i++) {
//			cursProgramare[i][2] = denumireProgramare[i];
//		}
//		
//		
//		 for(int i = 0; i < idProgramare.length; i++) {
//		    	for (int j = 0; j < cursProgramare[i].length ; j++) {
//		    		System.out.print("[" + matrice[i][j] + "]");
//		    	}
//		    	System.out.println();
//		    }


		
		
		
		
		
//		for (int i = 0; i < idProgramare.length; i++) {
//			System.out.print("[" + idProgramare[i] + "]");
//		}
//		for (int i = 0; i < pretProgramare.length; i++) {
//			System.out.print("[" + pretProgramare[i] +"]");
//		}
		
		
		
//	}
	
	
	@Override
	public void adaugaCurs() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void afiseazaCurs() {
		cursuri(getId(), getPret(), getDenumire());
	}
	@Override
	public void afiseazaCursuriProgramare() {
		//cursuriProgramare(getId(), getPret(), getDenumire());	
	}
	@Override
	public void stergeCurs() {
		// TODO Auto-generated method stub	
	}

	
	public static void main(String args[]) {
		
		Cursuri matrice = new Cursuri();
		matrice.afiseazaCurs();	
		System.out.println();
		matrice.afiseazaCursuriProgramare();
		
	}
	
	
}
