class SimpleStartup{
	private int[] locationcell;
	private int numOfHits=0;
	
	public void setLocation(int[] locs){
		locationcell=locs;
	}
	
	public String CheckYourself(int guess){
		String result="miss";
		for(int cell:locationcell){
			if(cell==guess){
				result="hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationcell.length){
			result="kill";
		}
		System.out.println(result);
		return result;
	}
}

public class SimpleStartupTestDrive{
	public static void main(String[] args){
		SimpleStartup dot=new SimpleStartup();
		int[] locations={2,3,4};
		dot.setLocation(locations);
		
		int userguess=5;
		String result=dot.CheckYourself(userguess);
		
		String testResult="failed";
		if(result.equals("hit")){
			testResult="passed";
		}
		System.out.println(testResult);
	}
}