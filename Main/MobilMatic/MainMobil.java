public class MainMobil {
	public static void main(String[] args) {
		Mobil xenia = new Mobil("a123b");
		
		System.out.println(xenia);
		
		xenia.oper('D');
		xenia.gas();
		System.out.println(xenia.toString());
		xenia.oper('R')
		System.out.println(xenia.toString());
		xenia.rem();
		System.out.println(xenia.toString());
		xenia.rem();
		System.out.println(xenia);


	}
	

}