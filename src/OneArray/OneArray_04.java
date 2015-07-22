package OneArray;

import java.util.Random;

public class OneArray_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd=new Random();//创建一个Random对象
		int len=rd.nextInt(20);//百宝箱中珠宝的个数
		int[] box=new int[len];//定义一个百宝箱（数组）
	    System.out.println("百宝箱中共有"+len+"个珠宝，其所有的编号如下");
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
	    		System.out.println("箱子中没有此类宝石");
	    	}else{
	    		System.out.println("此类宝石在第"+(index+1)+"个箱子中");
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
