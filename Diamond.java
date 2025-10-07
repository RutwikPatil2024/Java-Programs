public class Diamond{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		printDiamond(n);
	}
	
	static void printDiamond(int n){
		//int nsp=n-1;
		int nsp=80;
		
		int nst=1;
		
		for(int i=1;i<=2*n-1;i++){
			//space printing
			for(int j=1;j<=nsp;j++){
				System.out.print(" ");
			}
			//start printing
			for(int k=1;k<=nst;k++){
				System.out.print(" *");
			}
			if(i<n){
				nsp--;
				nst++;
			}
			else{
				nsp++;
				nst--;
			}
			//next line
			System.out.println();
		}
	}
}