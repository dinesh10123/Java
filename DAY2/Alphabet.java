public class Alphabet{
	public static void main(String[] args) {
		for(int i=65; i<=122; i++){
			// if(i>90 && i<97)
			// 	continue;
			if(i>=65 && i<=90)
				System.out.println(i+" "+(char)i);
			else if(i>=97 && i<=122)
				System.out.println(i+ " "+(char)i);
		}

	}
}