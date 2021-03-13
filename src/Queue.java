
public class Queue {
	
	private final LinkedList linkedList;

	public Queue() {
		this.linkedList=new LinkedList();
	}
	
	
	public void rear(int val) {
		this.linkedList.insertAtLast(val);
	}
	
	public void front() {
		this.linkedList.deleteFirst();
	}
	
	public void list() {
		this.linkedList.viewList();
	}

}
