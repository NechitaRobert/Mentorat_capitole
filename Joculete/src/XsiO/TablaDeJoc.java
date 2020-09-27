<<<<<<< HEAD
package XsiO;

public class TablaDeJoc {

	// creearea variabilei tabla
	public static String tabla[][] = new String[3][3];
	
	// constructorul
	public TablaDeJoc() {}
	public TablaDeJoc(String tabla[][]) {
		TablaDeJoc.tabla = tabla;
	}
	
	// getter si setter
	public String[][] getTabla() {
		return tabla;
	}
	public void setTabla(String[][] tabla) {
		TablaDeJoc.tabla = tabla;
	}
	
	// implementarea valorilor in tabla
	public void tablaJocului() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				tabla[i][j] = " ";
			}
		}
	}
	
	// afisarea tablei
	public void afisareTabla() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + tabla[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	
}
=======
package XsiO;

public class TablaDeJoc {

	// creearea variabilei tabla
	public static String tabla[][] = new String[3][3];
	
	// constructorul
	public TablaDeJoc() {}
	public TablaDeJoc(String tabla[][]) {
		TablaDeJoc.tabla = tabla;
	}
	
	// getter si setter
	public String[][] getTabla() {
		return tabla;
	}
	public void setTabla(String[][] tabla) {
		TablaDeJoc.tabla = tabla;
	}
	
	// implementarea valorilor in tabla
	public void tablaJocului() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++ ) {
				tabla[i][j] = " ";
			}
		}
	}
	
	// afisarea tablei
	public void afisareTabla() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + tabla[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	
}
>>>>>>> ede2816... actualizare
