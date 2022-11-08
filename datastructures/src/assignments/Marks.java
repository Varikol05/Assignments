package assignments;
public class Marks {

	public static void main(String[] args) {
		int s1=68,s2=82,s3=71;
		if(s1>60 && s2>60 &&s3>60) {
			System.out.println("Passed");
		}
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60) {
			System.out.println("Promoted");
		}
		else if(s1>60 || s2>60 || s3>60 ||s1<60 && s2<60 && s3<60) { 
			System.out.println("failed");
		}
	}

}

