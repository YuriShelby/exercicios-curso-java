package seresVivos;

public class Aranha extends Animal {
	
	private int veneno;
	public Aranha(int vel, int massa, int for�a, int veneno) {
		super(vel, massa, for�a);
		this.veneno = veneno;
	}
	
	@Override
	public void atacar(Animal a) {
		if(this.getVivo()) {
			if((this.getFor�a() + this.veneno) > a.getFor�a()) {
				a.setVivo(false);
			}else {
				this.setVivo(false);
			}
		}else {
			System.out.println("----------------------------");
			System.out.println("Este animal est� morto, n�o pode atacar.");
		}
		
		
		
	}

}
