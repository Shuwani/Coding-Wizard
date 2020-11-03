package package1;

public class Prime10001st {
		public static int prime(int n){
		for(int i=3;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}
		public static void main(String[] args) {
			int n=2;
			int temp=3;
			int cons=3;
			while(n<=10001){
				if(prime(temp)==1){
					n++;
			}
				cons=temp;
				temp=temp+2;
			}
			System.out.println(cons);
	}
}
