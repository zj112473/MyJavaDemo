package ClassDemo;

public class ClassDemo_01 {
	
	String name;
	String phonenum;
	String email;
	String address;
	public ClassDemo_01(String name,String phonenum,String email,String address){
		this.name=name;
		this.phonenum=phonenum;
		this.email=email;
		this.address=address;
	}
	public void printMassage(){
		System.out.println("����:"+name);
		System.out.println("��ϵ�绰:"+phonenum);
		System.out.println("���������ַ:"+email);
		System.out.println("Ŀǰ��ס��ַ:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo_01 cd=new ClassDemo_01("�Ž�","15522033432","1037539080@qq.com","�ӱ���ҵ��ѧ");
        cd.printMassage();
		
	}

}
