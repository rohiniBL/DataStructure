


class LinkedList {
	
	int size;
	Node start; //head
	
	public LinkedList() {
		this.size=0;
		this.start=null;
	}
	
	public boolean isEmpty() {
		if(start==null) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	public void viewList() {
		Node t;
		if(isEmpty()) {
			System.out.println("List Empty");
		}else
		{
			t=start;
			   System.out.println("Items -> ");
			for(int i=0;i<size;i++) {
				System.out.print(t.getData()+" ");
				t=t.getNext();
			}
			
		}
	}
	
	public void insertAtFirst(int val) {
		Node n;
		n=new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}
	
	public void insertAtLast(int val) {
		Node n,t;
		n=new Node();
		n.setData(val);
		t=start;
		if(t==null) {
			start=n;
		}
		else
		{
			while(t.getNext() != null) 
				t=t.getNext();
				t.setNext(n);
		}
		size++;
	}
	
	public void insertAtPos(int val,int pos) {
		if(pos==1) {
			insertAtFirst(val);
		}else if(pos == size+1) {
			
			insertAtLast(val);
		}
		else if(pos>1 &&pos<=size)
		{
			Node n,t;
			n=new Node(val,null);
			t=start;
			for(int i=1;i<pos;i++)
				t=t.getNext();
			     n.setNext(t.getNext());
			     t.setNext(n);
			     size++;
	
		}else {
			System.out.println("insertion not possible"+pos);
		}
		}

	public void deleteFirst() {
		if(start==null) {
			System.out.println("List is already empty");
		}else {
			start=start.getNext();
			size--;
		}
	}
	
	public void deleteLast() {
		if(start==null) {
			System.out.println("List is already empty");
		}else if(size==1){
			start=null;
			size--;
		}else {
			Node t;
			t=start;
			for(int i=1;i<size-1;i++)
				t=t.getNext();
			    t.setNext(null);
			    size--;
		}
		
	}
	
	public void search(int val) {
		Node n,t;
		  int i = 1;  
	       boolean flag = false;  
	       t=start;
		if(start == null) {
			System.out.println("List is empty");
		}else {
			while(t.getNext() !=null) {
				if(t.getData() == val) {
					System.out.println("found");
					flag=true;
					break;
			}
				i++;
				t=t.getNext();
				
		}
		
	}
		  if(flag)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");  
		
}
}