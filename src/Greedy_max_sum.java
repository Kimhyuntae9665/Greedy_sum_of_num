import java.util.Scanner;

public class Greedy_max_sum {
	
	public static int N;
	public static int limit_num;
	public static int count;
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		for(int i=1; ;i++) { //1���� ��� ���� ���� 
			if(limit_num>N) { //limit_num�� N�� �Ѿ�� ��� ���߰� �Ѿ ���������� count���� -1�� �� �ش�.
				break;
			}
			
			limit_num+=i;//1���� ���ڰ� �����ؼ� �������ٴ°� ����Ʈ 
			count++;
		}
		
		System.out.println(count-1);
		

	}

}
