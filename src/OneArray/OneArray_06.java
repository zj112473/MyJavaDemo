package OneArray;

public class OneArray_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] person=getLocation();
		System.out.println("�������Ľ�����£�������0��ʾ�Ѿ��뿪Ȧ�ӣ�1��ʾ����Ȧ���");
		for(int i=0;i<person.length;i++){
			System.out.print(person[i]+" ");
		if((i+1)%5==0){
			System.out.println();
		}
		if(person[i]==1){
		System.out.println("\n�����ԭ����λ��Ϊ"+i);	
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
