package string_Programs;

public class ReverseEntireStringInSamePlace {
	public static void main (String arg[]) {
	
	String s="Elementary My Dear Watson";
	//o/p:"yratnemelE yM raeD nostaW"
	String[] str=s.split(" ");
	for(String str1:str)
	{
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
			
		}
		System.out.print(" ");
	}

}
}
