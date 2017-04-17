package Sorting;

public class Mergesort {

	public static void main(String[] args) {
		int A[]=new int[10];
		populateA(A);
		System.out.println("before sort: ");
		printA(A);
		A=mergesort(A);
		System.out.println("\nAfter sort: ");
		printA(A);
	}
	public static int[] mergesort(int [] B){
		if(B.length<=1){
		return B;
		}
		int midpoint=B.length/2;
		int[] left=new int[midpoint];
		int[] right;
		if(B.length %2==0){
			right=new int[midpoint];
		}
		else{
			right=new int[midpoint+1];
		}
		int [] result=new int[B.length];
		for(int i=0;i<midpoint;i++){
			left[i]=B[i];
		}
		int x=0;
		for(int j=midpoint;j<B.length;j++){
			if(x<right.length){
			right[x]=B[j];
			x++;
			}
		}
		left=mergesort(left);
		right=mergesort(right);
		result=merge(left,right);
		return result;
	}
	public static int[] merge(int[] left,int[] right){
		int lengthresult=left.length+right.length;
		int [] result=new int[lengthresult];
		int indexl=0;
		int indexr=0;
		int indexres=0;
		//if i have element more l and r keep merge on it
		while(indexl<left.length||indexr<right.length){
			if(indexl<left.length&&indexr<right.length){
				//if left element smaller than right element than place it first
				if(left[indexl]<=right[indexr]){
					result[indexres]=left[indexl];
					indexl++;
					indexres++;
				}
				//otherways right element place
				else{
					result[indexres]=right[indexr];
					indexl++;
					indexres++;
				}
			}
			//if we dont have element both of them check left and place it
			else if(indexl<left.length){
				result[indexres]=left[indexl];
				indexl++;
				indexres++;
				
			}
			//other ways it gonna place right element
			else if(indexr<right.length){
				result[indexres]=right[indexr];
				indexl++;
				indexres++;
			}
		}
		return result;
	}
	public static void printA(int [] B){
		for(int i=0;i<B.length;i++){
			System.out.println(B[i]+" ");
		}
	}
	public static int[] populateA (int [ ] B){
		for(int i=0;i<B.length;i++){
			B[i]=(int)(Math.random()*100);
		}
		return  B;
	}
}

