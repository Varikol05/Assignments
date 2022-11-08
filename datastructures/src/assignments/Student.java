package assignments;
public class Student {

	public static void main(String[] args) {
		int[] s1= {82,76,92};
		int[] s2= {73,69,94};
		int[] s3= {62,88,74};
		
		int tots1=0;
		int tots2=0;
		int tots3=0;
		for(int i=0;i<3;i++) {
			 
			tots1=tots1+s1[i];
			tots2=tots2+s2[i];
			tots3=tots3+s3[i];
		}
		int avgs1=tots1/3;
		int avgs2=tots2/3;
		int avgs3=tots3/3;
		
		System.out.println("Total Score and Avarage Score of Student 1: "+tots1+" ,"+avgs1);
		System.out.println("Total Score and Avarage Score of Student 2: "+tots2+" ,"+avgs2);
		System.out.println("Total Score and Avarage Score of Student 3: "+tots3+" ,"+avgs3);
		 int tota=s1[0]+s2[0]+s3[0];
		 int totb=s1[1]+s2[1]+s3[1];
		 int totc=s1[2]+s2[2]+s3[2];
		 
		 int avga=tota/3;
		 int avgb=totb/3;
		 int avgc=totc/3;
		 
		 System.out.println("");
		 
		 System.out.println("Total And Average Scored by Students is Subject A: "+tota+" ,"+avga);
		 System.out.println("Total And Average Scored by Students is Subject B: "+totb+" ,"+avgb);
		 System.out.println("Total And Average Scored by Students is Subject C: "+totc+" ,"+avgc);

	}

}
