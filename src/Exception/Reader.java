package Exception;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Reader {

	public static void main(String[] args) {
		//String FilePath="//Users//kafiluddin//Desktop//java//assignment3degree.rtf";
		String FilePath="//Users//kafiluddin//Desktop//test.rtf";
		FileReader fr=null;
		
		BufferedReader br=null;
		try{
			fr=new FileReader(FilePath);
			br=new BufferedReader(fr);
			String text="";
			while((text=br.readLine())!= null){
				System.out.println(text);
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
			
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException en){
					en.printStackTrace();
					
				}
				if(fr!=null){
					try{
						fr.close();
					}catch(IOException ek){
						ek.printStackTrace();
					}
				}
			}
		}

	}

}
