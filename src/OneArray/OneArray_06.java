package OneArray;

public class OneArray_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] person=getLocation();
		System.out.println("最后输出的结果如下：（其中0表示已经离开圈子，1表示还在圈子里）");
		for(int i=0;i<person.length;i++){
			System.out.print(person[i]+" ");
		if((i+1)%5==0){
			System.out.println();
		}
		if(person[i]==1){
		System.out.println("\n这个人原来的位置为"+i);	
		}
		}
	}
	public static int[] getLocation(){
		int person[]=new int[17];
		for(int i=0;i<person.length;i++){
			person[i]=1;
		}
		int i=0;
		int k=0;
		int count=0;
		while(true){
			i=i%17;
			if(person[i]==1){
				k++;
				if(k%3==0){
					person[i]=0;
					count++;
				}
			}
			if(count==16){
				break;
			}
			i++;
		}
		return person;
	}

}
