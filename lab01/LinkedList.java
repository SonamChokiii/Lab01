public class LinkedList
{
	int size;
	Node head;
	Node tail;

	public LinkedList()
	{
		size=0;
		head=null;
		tail=null;
	}
	// size 
	public int size()
	{
		return size;
	}
	// isEmpty
	public boolean isEmpty() // boolean as it is true or false.
	{
		if (size==0)
		{
			return true;
		}
		return false;
	}
	// first
	public int first()
	{
		if (isEmpty())
		{
			return 0;
		}
		return head.getElement();
	}
	//last
	public int last()
	{
		if (isEmpty())
		{
			return 0;
		}
		return tail.getElement();
	}
	//addFirst
	public  void addFirst(int n)
	{
		Node newest = new Node(n, null);
		
		if (size()== 0)
		{
			head = newest;
			tail =  newest;
		}
		else
		{
			newest.setNext(head);
			head = newest;

		}
		size = size+1;
	}
	public void addLast (int n)
	{
		Node newest = new Node (n, null);
		if (size()== 0)
		{
			head = newest;
			tail =  newest;
		}
		else
		{
			tail.setNext(newest);
			tail =  newest;
		}
		size+=1;
	}
	//Removes and returns the first element of the list.
	public int removeFirst()
	{
		int deletedElement = head.getElement();
		if (size()==0)
		{
			return 0;
		}
		else{
			head= head.getNext();
			size=size-1;

		}
		return deletedElement;
	}
		
}
class Node{
	private int element;
	private Node next;
	//constructor
	public Node(int element, Node next)
	{
		this.element = element;
			this.next = next;
	}
	//getElement
	public int getElement()
	{
		return element;
	}
	//getNext()
	public Node getNext(){   // Node datatype as it should have same datatype of next.
		return next;
	}

	public void setElement(int n) // void as it doesnot return the element.
	{

		element =  n;
	}
	public void setNext (Node n)
	{
		next=n;
	}
}
	

