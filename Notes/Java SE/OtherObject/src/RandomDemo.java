import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rd=new Random();
		for(int i=0;i<10;i++){
			int j=rd.nextInt(20);//0-20的随机数，包含0不包含20
			System.out.println(j);
		}
	}

}
