
public class Stack {

	private final LinkedList linkedList;

	public Stack() {
		this.linkedList=new LinkedList();
	}
	
	public void push(int val) {
		this.linkedList.insertAtFirst(val);
	}
	
	public void pop() {
		this.linkedList.deleteFirst();
	}
	
	public int peak() {
		return this.linkedList.start.getData();
	}
	
	public void list() {
		this.linkedList.viewList();
	}
	
	
}