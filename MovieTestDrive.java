class Movie{
	String name;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("Playing the Movie");
	}
}

public class MovieTestDrive{
	public static void main(String[] arg)
	{
		Movie m=new Movie();
		m.name="Ram and Raj";
		m.genre="comedy";
		m.rating=10;
		
		m.playIt();
	}
}