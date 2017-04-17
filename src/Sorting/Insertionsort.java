package Sorting;

public class Insertionsort {
 public static void main(String[] args) {
	        int [] kafil={6,5,8,9,4,3,0,12,34};

	        int temp;
	        for(int i=0;i<kafil.length-1;i++){
	            for(int j=i+1;j<kafil.length;j++){
	                if(kafil[i]>kafil[j]){
	                    temp=kafil[i];
	                    kafil[i]=kafil[j];
	                    kafil[j]=temp;
	                }
	      }
	 }
	        System.out.print("Sorted Array:");
	        //print now the sorted array
	        for(int n=0;n<kafil.length;n++){
	            System.out.print(" "+kafil[n]);
	        }
	    }

}
