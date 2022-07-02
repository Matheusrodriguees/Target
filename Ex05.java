package kgh;

public class Ex05 {
		public static void main(String[] args) {
			String str = "DelfStack";
			System.out.println(str);
			String reverseStr = reverseIt(str, str.length()-1);
			System.out.println(reverseStr);
		}
		static String reverseIt(String str, int index){
			if(index == 0){
				return str.charAt(0) + "";
			}
			char letter = str.charAt(index);
			return letter + reverseIt(str, index-1);
	}
}

/*public class Ex05 {
	public static void main(String[] args) {
		String str = "DelfStack";
		System.out.println(str);
		StringBuilder dest = new StringBuilder();
		for (int i = (str.length() - 1); i >= 0; i--){
			dest.append(str.charAt(i));
		}
		System.out.println(dest);
	}
}*/