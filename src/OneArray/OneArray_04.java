package OneArray;

import java.util.Random;

public class OneArray_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd=new Random();//����һ��Random����
		int len=rd.nextInt(20);//�ٱ������鱦�ĸ���
		int[] box=new int[len];//����һ���ٱ��䣨���飩
	    System.out.println("�ٱ����й���"+len+"���鱦�������еı������");
	    for(int i=0;i<len;i++){
	    	box[i]=rd.nextInt(20);
	    	System.out.print(box[i]+" ");
	    	if((i+1)%5==0){
	    		System.out.println();
	    	}
	    }
	        System.out.println();
	    	int index=searchBotey(box,8);
	    	if(index==-1){
	    		System.out.println("������û�д��౦ʯ");
	    	}else{
	    		System.out.println("���౦ʯ�ڵ�"+(index+1)+"��������");
	    	}
	}
	public static int searchBotey(int[] box,int index){
		int num=-1;
		for(int i=0;i<box.length;i++){
			if(index==box[i]){
				num=i;
			}
		}
		return num;
	}
}
