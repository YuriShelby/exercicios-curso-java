package seresVivos;

public class BaseAnimal {
	
	public static void main(String[] args) {
		
		Sapo a1 = new Sapo(10, 10, 10);
		Aranha a2 = new Aranha(5,5,5,3);
		Formiga a3 = new Formiga(2,2,2);
		Formiga a4 = new Formiga(2,2,2);
		Vegetal v1 = new Vegetal(1);
		Vegetal v2 = new Vegetal(5);
		Vegetal v3 = new Vegetal(10);
		
		a2.info();
		a2.atacar(a3);
		a2.comer(a3.getMassa());
		a2.info();
		System.out.println(a3.getVivo());
		a1.atacar(a2);
		a1.info();		
		a1.comer(a2.getMassa());
		a1.info();
		a2.info();
		a4.comer(v1.getMassa());
		a4.comer(v2.getMassa());
		a4.comer(v3.getMassa());
		a1.atacar(a4);
		a1.info();
		a4.info();
		a4.comer(a1.getMassa());
		a4.info();
	}	

}
