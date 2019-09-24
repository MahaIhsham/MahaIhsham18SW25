class Odd{
	public static void main(String args[]){
		int n=100;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				continue;
			}
			System.out.print(i+" ");
		}
	}
}