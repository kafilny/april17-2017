package Stuck_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;



public class Usequeue {

	public static void main(String[] args) {
		 Queue<String> queue=new LinkedList<String>();
		 queue.add("kaf");
		 queue.add("jon");
		 queue.add("fon");
		 queue.add("bon");
		 Iterator it=queue.iterator();
		 while(it.hasNext()){
			 System.out.println(queue.remove());
		 }
	}

}
