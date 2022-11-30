package Lab6;

public class TestMovies {

	public static void main(String[] args) {
		Movies[] movie = new	Movies[4];
		movie[0] = new Movies(32132, 321,8.4, 2015, "Terminator");
		movie[1] = new Movies(65465, 87978,8.9, 2019, "Frozen 2");
		movie[2] = new Movies(9008764,365 ,8.4, 2019, "The Lion King");
		movie[3] = new Movies(32030030, 7434,9.1, 2017, "The Beauty and the Beast");
		for(Movies e: movie){
			System.out.println(e);
			
		}
		}
		
		

	}
