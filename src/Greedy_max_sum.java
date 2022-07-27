import java.util.Scanner;

public class Greedy_max_sum {
	
	public static int N;
	public static int limit_num;
	public static int count;
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		
		for(int i=1; ;i++) { //1부터 계속 더해 간다 
			if(limit_num>N) { //limit_num이 N을 넘어가면 즉시 멈추고 넘어간 시점에서의 count에서 -1을 해 준다.
				break;
			}
			
			limit_num+=i;//1부터 숫자가 연속해서 더해진다는게 포인트 
			count++;
		}
		
		System.out.println(count-1);
		

	}

}
