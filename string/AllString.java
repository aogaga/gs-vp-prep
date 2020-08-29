public class AllString{
	public static void main(String [] args){
		
		waysOfCreatingString();
	}

	public static void waysOfCreatingString(){

		String s = new String();
		char chars[] = {'a', 'b', 'c'};
		String s2 = new String(chars);
		System.out.println(s2);
	}
}