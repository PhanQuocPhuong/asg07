

package item;


public class StringItem implements Item{

	private String value;

	public StringItem(String value){
		this.value=value;
	}


	public Item clone(){
		return null;
	}

	public String toString(){
		return value;
	}


	public boolean equals(MyList mylist) {
		// TODO Auto-generated method stub
		return false;
	}


}