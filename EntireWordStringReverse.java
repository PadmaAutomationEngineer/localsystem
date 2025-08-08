package string_Programs;

public class EntireWordStringReverse {
	public static void main(String[] args) {
		
		String s="padma shree is a software Engineer";
		String[] str=s.split("");
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]+"");
		}
		
	}

}