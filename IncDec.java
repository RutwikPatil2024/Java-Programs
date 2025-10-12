public class IncDec{
	public static void main(String[] args){
		int x=0;
		
		int z=x++;
		System.out.println("x : "+x+"   z : "+z);
		
		x=0;
		z=++x;
		System.out.println("x : "+x+"    z : "+z);
	}
}