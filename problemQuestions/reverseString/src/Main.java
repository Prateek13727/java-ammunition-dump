public class Main {
	public static void main(String[] args){
		String str = "Prateek";
		System.out.println(reverse(str));
	}

	//replace string without using another variable
	public static String reverse(String str){
		int len = str.length();
		char temp = '';
		for(int i = 0; i<len/2 ; i++){
			temp = str.charAt(i);
			str.charAt(i) = str.charAt(len-1-i);
			str.charAt(len-1-i) = temp;
		}
		return str;
	}
}

