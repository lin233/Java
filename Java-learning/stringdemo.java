public class stringdemo{
	public static void main(String args[]){
		String stra = "hello";
		String strb = "hello";
		String strc = new String("hello");
		System.out.println(stra.equals(strb));
		System.out.println(stra.equals(strc));
		System.out.println(strb.equals(strc));
	}
}	