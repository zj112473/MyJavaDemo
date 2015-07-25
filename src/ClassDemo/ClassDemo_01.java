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
		System.out.println("姓名:"+name);
		System.out.println("联系电话:"+phonenum);
		System.out.println("电子邮箱地址:"+email);
		System.out.println("目前居住地址:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo_01 cd=new ClassDemo_01("张建","15522033432","1037539080@qq.com","河北工业大学");
        cd.printMassage();
		
	}

}
