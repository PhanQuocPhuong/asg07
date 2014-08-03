
package item;

class Node {
    Item data;
	Node next;
	Node (Item data) {
	this.data = (Item) data.clone();  
        }

	Node(Item data,Node node){
		this.data=data;
		next=node;
        }
}
