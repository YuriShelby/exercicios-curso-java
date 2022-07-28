package seresVivos;

abstract class Animal implements SerVivo{
	
	private Boolean vivo;
	private int massa;
	private int vel;
	private int força;
	
	public Animal(int vel, int massa, int força) {
		
		this.vivo = true;
		this.massa = massa;
		this.força = força;
		this.vel = vel;
		
	}
	
	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}
	
	public Boolean getVivo() {
		return this.vivo;
	}
	
	public int getForça() {
		return this.força;
	}

	public void setForça(int força) {
		this.força = força;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}
	
	public void atacar(Animal a) {
		
		if(this.vivo) {
			if(this.força > a.força) {
				a.vivo = false;
			}else {
				this.vivo = false;
			}
		}else {
			System.out.println("--------------------------------");
			System.out.println("Este animal está morto, não pode atacar.");
			System.out.println("--------------------------------");
		}
	}
	
	public void comer(int massa) {
		
		if(this.vivo) {
			this.força += massa;
		}else {
			System.out.println("--------------------------------");
			System.out.println("Este animal está morto, não pode comer.");
			System.out.println("--------------------------------");
		}
	}
	public void info() {
		
		System.out.printf("Tipo.: %s\n", getClass().toString());
		System.out.printf("Vivo.: %s\n", this.getVivo() ? "Sim" : "Não");
		System.out.printf("Massa: %d\n", this.massa);
		System.out.printf("Vel..: %d\n", this.vel);
		System.out.printf("Força: %d\n", this.força);
		System.out.printf("-----------------------------\n");
		
	}
}
	

