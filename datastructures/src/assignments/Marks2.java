package assignments;
public class Marks2 {

	public static void main(String[] args) {
		int s1=35,s2=53,s3=48;
		if(s1>60 && s2>60 && s3>60) {
			System.out.println("Passed");
		}
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60) {
			System.out.println("promoted");
		}
		else if(s1>60 || s2>60 || s3>60 || s1<60 && s2<60 && s3<60) {
			System.out.println("failed");
		}
	}

	}




