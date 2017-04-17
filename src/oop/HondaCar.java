package oop;

public class HondaCar extends SemiVanCar implements VanVehicle{

	public static void main(String[] args) {
		HondaCar carobj=new HondaCar();
		carobj.hydrolicbreak();
		carobj.motobyke();
		carobj.numoftire();
		carobj.runsmph();
		carobj.start();
		carobj.wheel();
		
		SemiVanCar carobj2=new HondaCar();
		
		
		VanVehicle carobj3= new HondaCar();
		carobj3.motobyke();

	}

	
	public void start() {
		System.out.println("u have to start engine");
				
	}

	
	public void hydrolicbreak() {
		System.out.println("when u drive a car u need to push break in order to stop car");
	}

	
	public void wheel() {
		System.out.println("hold ur wheel when u drive");
	}

	
	public void motobyke() {
		System.out.println("i like motobike");
	}

	

	public void runsmph() {
		System.out.println("my car runs 100mph");
		
	}

}
