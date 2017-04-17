package Stuck_Queue;

import java.util.Iterator;
import java.util.Stack;

public class Stackuse {

	public static void main(String[] args) {
		Stack<String>st=new Stack<String>();
		st.add("kaf");
		st.add("nur");
		st.add("nal");
		st.add("kal");
		Iterator it=st.iterator();
		while(it.hasNext()){
			System.out.println(st.pop());
		}
	}

}
