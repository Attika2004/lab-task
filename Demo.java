public class Demo{

public static void main(String args[]){

Artist a1=new Artist("Paul");
System.out.println("       Artist name"); 
a1.display();
Artwork ar1 =new Artwork("Best scene",1857,a1);
System.out.println("     Before changing");
ar1.display();

Artwork shallowCopy = ar1.shallowCopy();
Artwork deepCopy = ar1.deepCopy();

ar1.getArtist().setname("Attika");
System.out.println("                  After Changing");
ar1.display();

System.out.println("                  Shallow Copy");
shallowCopy.display();
System.out.println("                  Deep Copy");
deepCopy.display();
	}
}

