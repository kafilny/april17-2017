package AllArreay;

import java.util.Scanner;

public class Usearay {
	public int[] setaray(int limit){
		int [] anice=new int[limit];
		Scanner ss=new Scanner(System.in);
		for(int i=0;i<anice.length;i++){
			System.out.println("please enter a num: ");
			anice[i]=ss.nextInt();
			try{
				if(ss!=null){
					ss.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return anice; 
	}
	
	public void retrivearray(int [] arnm){
		for(int j=0;j<arnm.length;j++){
			System.out.println(arnm[j]);
		}
	}
      
}
