
package item;

public class NumeralItem implements Item {

	private final int value;

	public NumeralItem(int value){
		this.value=value;
	}


       
	public Item clone(){
		return null ;
	}

      
	public String toString(){
		return ""+value;
	}

	public boolean equals(MyList mylist) {
		return false;
	}

}