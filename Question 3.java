package package1;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		long maxchainsize=0,num=0,res=0,sizeofchain=0;
		for(long i=2;i<1000000;i++){
			sizeofchain=0;
			num=i;
			while(num!=1){
				if(num%2==0){
					num=num/2;
				}
				else{
					num=3*num+1;
				}
				sizeofchain++;
			}
			if(sizeofchain> maxchainsize){
				maxchainsize=sizeofchain;
				res=i;
			}
		}
		System.out.println("No. that produces longest chain under 1 million is:"+res);
		System.out.println("Max size of chain is:"+maxchainsize);

	}

}
