package OneArray;

import java.util.Random;

public class OneArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd=new Random();//����Random����
		int total[]=new int[30];//����һ������Ϊ30��int������total�������飩
		int odd[]=new int[30];//����һ������Ϊ30��int���͵�����odd���������飩
		int even[]=new int[30];//����һ������Ϊ30��int���͵�����even��ż�����飩
		int j=0,k=0;
		System.out.println("������total��Ԫ�����£�");
		for(int i=0;i<total.length;i++){
			total[i]=rd.nextInt(100);//Ϊtotal���鸳��ֵ
			if(total[i]%2==0){       //�жϵ�ǰ�����ֵ�Ƿ�Ϊż��
				even[k]=total[i];
				k++;
			}
			else{
				odd[j]=total[i];
				j++;
			}
			System.out.print(" "+total[i]);
			if((i+1)%5==0){       //ÿ5��Ԫ��һ��
				System.out.println();
			}
		}
		System.out.println("\n��ż�ཻ�������");
		int max=j>k?j:k;   //��j��k���߼�����ֵ
		int min=j>k?k:j;   //��j��k���߼����Сֵ
		/*�����ǽ�������ż�������������ֻ�������������ż�����*/
		for(int x=0;x<max;x++){
			if(x>=min&&j==min){
				//��x�����������Сֵʱ����������Сֵ���������ĸ���������������ż��
				System.out.print(" "+even[x]);
			}else if(x>=min&&k==min){
				//��x�����������Сֵʱ����������Сֵ����ż���ĸ�������������������
				System.out.print(" "+odd[x]);
			}else if(x<min){//�������������ż��
				System.out.print(" "+odd[x]+","+even[x]);
			}
			if((x+1)%5==0)   //ÿ5��Ԫ��һ��
				System.out.println();
		}
	}

}
