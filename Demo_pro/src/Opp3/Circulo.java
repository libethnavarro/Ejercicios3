package Opp3;

public class Circulo {
	private double radio;
	public static int control=12;
	
	public static void mostrar(){
		System.out.println("llamando a  mostrar");
	}
	
	public Circulo(){	
		this.radio=1;
	}
	
	public Circulo(double radioParam){
		this.radio=radioParam;	
		}
	
	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
    
	public double getArea(){
		return Math.PI*radio*radio;
	}
}

