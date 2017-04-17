package AllArreay;

import java.util.Scanner;

public class Barray {

	public static void main(String[] args) {
		
int namearay[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<namearay.length;i++){
System.out.println("enter a number");
namearay[i]=sc.nextInt();
}
try{if (sc!=null){
     sc.close();
}
	
}catch(Exception e){
	e.printStackTrace();
	
}
for(int j=0;j<namearay.length;j++){
	System.out.println(namearay[j]);
	
}
	}

}
