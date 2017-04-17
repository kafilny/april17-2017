package SuerSubclass;

public class Prelecturer extends Lecturer {
	
	public void prelec(){
		System.out.println("previous step of lecturer");
	}
	public static void main(String[] args) {
		Prelecturer prelec=new Prelecturer();
		prelec.obeyPrinciple();
		prelec.prelec();
		
		
		
		Lecturer lec=new Prelecturer();
		lec.resfromstu();
		
		Principle princ=new Lecturer();
		princ.command();
		princ.respect();
		

	}

}
