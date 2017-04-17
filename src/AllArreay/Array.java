package AllArreay;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		BuildArray build = new BuildArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter you array limit: ");
		int limit = sc.nextInt();
		int [] array = build.setArray(limit);
		build.retrieveArray(array);
		try{
			if(sc!=null){
				sc.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
