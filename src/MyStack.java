
public class MyStack {
	
	private final LinkedList linkedList;
	
	public MyStack() {
		linkedList=new LinkedList();
	}
	
	public void push(int val)
	{
		linkedList.insertAtFirst(val);
	}
	
	public int peak() {
		return linkedList.start.getData();
	}
	
	public void pop() {
		linkedList.deleteFirst();
	}
	
	public void list() {
		linkedList.viewList();
	}
//	
//	
//	public void rear(int val)
//	{
//		linkedList.insertAtLast(val);
//	}
//	
//	public void front()
//	{
//		linkedList.deleteFirst();
//	}
	
//	public int peak() {
//	return linkedList.start.getData();
//}
//	
	
	
	

}
