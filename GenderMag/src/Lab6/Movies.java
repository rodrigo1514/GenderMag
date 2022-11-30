package Lab6;
	 
public class Movies {
	Integer MovieId ; // movie id	
	Integer NumView ; // Number of viewers
	Double Rating; //rating for the movie
	Integer Release; //release year of movie
	String Name; //name of movie 
	
	    
	//constructors
	    public Movies(Integer movieId, Integer numView, Double rating, Integer release, String name) {
			super();
			MovieId = movieId;
			NumView = numView;
			Rating = rating;
			Release = release;
			Name = name;    
	}
	// getters and setters
	public Integer getMovieId() {
		return MovieId;
	}
	public void setMovieId(Integer movieId) {
		MovieId = movieId;
	}
	public Integer getNumView() {
		return NumView;
	}
	public void setNumView(Integer numView) {
		NumView = numView;
	}
	public Double getRating() {
		return Rating;
	}
	public void setRating(Double rating) {
		Rating = rating;
	}
	public Integer getRelease() {
		return Release;
	}
	public void setRelease(Integer release) {
		Release = release;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	//ToString
	@Override
	public String toString() {
		return "Movies [MovieId=" + MovieId + ", NumView=" + NumView + ", Rating=" + Rating + ", Release=" + Release
				+ ", Name=" + Name + "]";
	}
	}