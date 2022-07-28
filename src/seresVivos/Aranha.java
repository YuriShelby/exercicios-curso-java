package seresVivos;

public class Aranha extends Animal {
	
	private int veneno;
	public Aranha(int vel, int massa, int força, int veneno) {
		super(vel, massa, força);
		this.veneno = veneno;
	}
	
	@Override
	public void atacar(Animal a) {
		if(this.getVivo()) {
			if((this.getForça() + this.veneno) > a.getForça()) {
				a.setVivo(false);
			}else {
				this.setVivo(false);
			}
		}else {
			System.out.println("----------------------------");
			System.out.println("Este animal está morto, não pode atacar.");
		}
		
		
		
	}

}
