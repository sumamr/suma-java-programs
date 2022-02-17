package suma;

public class Sdemo {

	public static void main(String[] args) {
		String s="suma";
		StringBuffer a=new StringBuffer(s);
		a.insert(4, " M R ");
		System.out.println("inserted String is "+a);	
		a.append("Manju");
		System.out.println("After Appending "+a);
		a.reverse();
		System.out.println("After Reversing "+a);
		a.replace(0, 3, "sudha");
		System.out.println("After replacing "+a);
		a.deleteCharAt(3);
		System.out.println("After deleting "+a);

	}

}
