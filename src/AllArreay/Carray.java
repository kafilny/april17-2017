package AllArreay;

import java.util.Scanner;

public class Carray {

	public static void main(String[] args) {
		int i;
		int karay []=new int[4];
		Scanner s=new Scanner(System.in);
		for(i=0;i<karay.length;i++){
			System.out.println("please enter a number");
			karay[i]=s.nextInt();
					}
		try{if(s!=null){
			s.close();
		}
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
				
		
		for(int j=0;j<karay.length;j++){
				System.out.println(karay[j]);
			}
		}
	}



