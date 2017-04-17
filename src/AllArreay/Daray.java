package AllArreay;

import java.util.Scanner;

public class Daray {

	public static void main(String[] args) {
		int daray[]=new int[7];
		Scanner a=new Scanner(System.in);
		for(int i=0;i<daray.length;i++){
			System.out.println("enter a number");
			daray[i]=a.nextInt();
		}
		try{if(a!=null){
			a.close();
		}
			
		}catch(Exception r){
			r.printStackTrace();
		}
		System.out.println("arrayindex\tvaluese");
		for(int j=0;j<daray.length;j++){
			System.out.println(j+"\t      "+daray[j]);
		}
	}

}
