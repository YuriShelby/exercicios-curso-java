package seresVivos;

abstract class Animal implements SerVivo{
	
	private Boolean vivo;
	private int massa;
	private int vel;
	private int for�a;
	
	public Animal(int vel, int massa, int for�a) {
		
		this.vivo = true;
		this.massa = massa;
		this.for�a = for�a;
		this.vel = vel;
		
	}
	
	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}
	
	public Boolean getVivo() {
		return this.vivo;
	}
	
	public int getFor�a() {
		return this.for�a;
	}

	public void setFor�a(int for�a) {
		this.for�a = for�a;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}
	
	public void atacar(Animal a) {
		
		if(this.vivo) {
			if(this.for�a > a.for�a) {
				a.vivo = false;
			}else {
				this.vivo = false;
			}
		}else {
			System.out.println("--------------------------------");
			System.out.println("Este animal est� morto, n�o pode atacar.");
			System.out.println("--------------------------------");
		}
	}
	
	public void comer(int massa) {
		
		if(this.vivo) {
			this.for�a += massa;
		}else {
			System.out.println("--------------------------------");
			System.out.println("Este animal est� morto, n�o pode comer.");
			System.out.println("--------------------------------");
		}
	}
	public void info() {
		
		System.out.printf("Tipo.: %s\n", getClass().toString());
		System.out.printf("Vivo.: %s\n", this.getVivo() ? "Sim" : "N�o");
		System.out.printf("Massa: %d\n", this.massa);
		System.out.printf("Vel..: %d\n", this.vel);
		System.out.printf("For�a: %d\n", this.for�a);
		System.out.printf("-----------------------------\n");
		
	}
}
	

