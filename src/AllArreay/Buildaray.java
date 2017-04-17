package AllArreay;

import java.util.Scanner;

public class Buildaray {

	public static void main(String[] args) {
		Usearay usarobj=new Usearay();
		Scanner an=new Scanner(System.in);
		System.out.println("enter ur array limit:");
		int limit=an.nextInt();
        int[]arnm=usarobj.setaray(limit);
		usarobj.retrivearray(arnm);
		try{
			if(an!=null){
				an.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
