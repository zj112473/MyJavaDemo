package OneArray;

import java.util.Random;

public class OneArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd=new Random();//创建Random对象
		int total[]=new int[30];//创建一个长度为30的int型数组total（总数组）
		int odd[]=new int[30];//创建一个长度为30的int类型的数组odd（奇数数组）
		int even[]=new int[30];//创建一个长度为30的int类型的数组even（偶数数组）
		int j=0,k=0;
		System.out.println("总数组total的元素如下：");
		for(int i=0;i<total.length;i++){
			total[i]=rd.nextInt(100);//为total数组赋初值
			if(total[i]%2==0){       //判断当前数组的值是否为偶数
				even[k]=total[i];
				k++;
			}
			else{
				odd[j]=total[i];
				j++;
			}
			System.out.print(" "+total[i]);
			if((i+1)%5==0){       //每5个元素一行
				System.out.println();
			}
		}
		System.out.println("\n奇偶相交替输出：");
		int max=j>k?j:k;   //求j和k两者间的最大值
		int min=j>k?k:j;   //求j和k两者间的最小值
		/*下面是将奇数和偶数交替输出，并只将多出的奇数或偶数输出*/
		for(int x=0;x<max;x++){
			if(x>=min&&j==min){
				//当x大于求出的最小值时，如果这个最小值等于奇数的个数，则输出多出的偶数
				System.out.print(" "+even[x]);
			}else if(x>=min&&k==min){
				//当x大于求出的最小值时，如果这个最小值等于偶数的个数，则输出多出的奇数
				System.out.print(" "+odd[x]);
			}else if(x<min){//交替输出奇数和偶数
				System.out.print(" "+odd[x]+","+even[x]);
			}
			if((x+1)%5==0)   //每5个元素一行
				System.out.println();
		}
	}

}
