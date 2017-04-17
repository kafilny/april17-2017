package Sorting;

public class Selectionsort {
	public static void main(String[] args) {
        int array[] = {6, 5, 3, 1, 8, 2, 4,13,23,56,32,43,11,};

        sort(array);
        printaray(array);
    }
    public static int[] sort(int[]array){
        for(int i=0;i<array.length;i++){
            int minindex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minindex]){
                    minindex=j;
                }

            }
            int temp=array[minindex];
            array[minindex]=array[i];
            array[i]=temp;

        }

return array;
    }

    public static void printaray(int[]a) {
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
	

}
