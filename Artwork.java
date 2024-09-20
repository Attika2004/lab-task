public class Artwork{

private String title;
private int year;
private Artist artist;


	// copy constructor
	Artwork(Artwork a){
		this.title=a.gettitle();
		this.year=a.getyear();
	//	this.artist=artist;
		

	}
	Artwork(){
		title = "No Title";
		year= 0;
		artist = new Artist("No name");
	}

	Artwork(String title, int year){
		this.title = title;
		this.year=year;
	}

	Artwork(String title, int year, Artist artist){
		this.title = title;
		this.year=year;
		this.artist= artist; //this will copy reference
	}
	public void settile(String title){
		this.title = title;
	}
	public void setyear(int year){
		this.year = year;
	}

	public String gettitle(){
		return title;
	}
	public int getyear(){
		return year;
	}

	public void setArtist(Artist artist){
	
		this.artist= artist;
	}
	public Artist getArtist(){
		return artist;
	}
	public void display(){
		System.out.println("Title :"+title);
		System.out.println("Year :"+year);
		System.out.println(" Name:"+ artist.getname());
		
		
	}
public Artwork deepCopy(){
Artist artist=new Artist(this.artist.getname());
return new Artwork(this.title,this.year,this.artist);
}

public Artwork shallowCopy(){
return new Artwork(this.title,this.year,this.artist);

}
}