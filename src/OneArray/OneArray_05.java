package OneArray;

import java.util.Random;

public class OneArray_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		int flag=0;
		int num;
		int[] array=new int[10];
		Random rd=new Random();
		System.out.println("原数组中的数为");
		for(int i=0;i<array.length;i++){
			array[i]=rd.nextInt(100);
			System.out.print(array[i]+" ");
			if((i+1)%5==0){
				System.out.println();
			}
		}
		System.out.println();
		for(int i=0;i<array.length;i++){
			if(i==0){
				min=array[0];
			}else{
				if(min>array[i]){
					min=array[i];
					flag=i;
				}
			}
		}
		num=array[9];
		array[9]=array[flag];
		array[flag]=num;
		System.out.println("交换后的数组为：");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
			if((i+1)%5==0){
				System.out.println();
			}
		}
		System.out.println("\n数组中的最小值为"+min+"它的下标为"+flag);

	}

}
