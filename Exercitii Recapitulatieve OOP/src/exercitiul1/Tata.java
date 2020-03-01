package exercitiul1;

public class Tata extends Salarii {

    private String numeleTatalui = "Ghita";
	
	public Tata() {}
	public Tata(int venitLunar, int nrDeAni, int oreSuplimentare, String numeleTatalui) {
		super (venitLunar, nrDeAni, oreSuplimentare);
		this.numeleTatalui = numeleTatalui;	
	}
	
	
	public String getnumeleTatalui() {
		return numeleTatalui;	
	}
	public String setnumeleTatalui(String numeleTatalui) {
		return this.numeleTatalui = numeleTatalui;
	}
	

	@Override
	public String getToString() {
		return (this.numeleTatalui + " are un salariu de ");
	}
	
	// abstract method and overriding method
	// first is abstract method
	public int getSalariuLunar(int venitLunar, int nrDeAni) {
		return venitLunar * nrDeAni;
	}
	// second is overriding method
	public int getSalariuLunar1(int venitLunar, int nrDeAni) {
		return venitLunar / nrDeAni;
	}
	
	

	
	
	
	
	
	
}
