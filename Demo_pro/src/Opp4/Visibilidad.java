package Opp4;

public class Visibilidad {

	public void metodoPublico(){
		System.out.println("metodo publico");
		metodoPrivado();
	}
	private void metodoPrivado(){
		System.out.println("metodo privado");
		
	}
	void metodoPaquete(){
		System.out.println("metodo paquete");
	}

}
