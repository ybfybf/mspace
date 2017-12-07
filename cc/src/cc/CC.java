package cc;

public class CC {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("xxx");
		StringBuilder cc=str;
		cc.append("ff");
		System.out.println(str);
		
	}
}	
