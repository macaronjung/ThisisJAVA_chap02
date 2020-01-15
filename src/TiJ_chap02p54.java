
public class TiJ_chap02p54 {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(longValue);
		
		long longValue2 = (long) 500.0;
		intValue = (int) longValue2;
		System.out.println(longValue2);
	}

}
