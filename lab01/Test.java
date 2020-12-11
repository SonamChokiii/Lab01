public class Test
{
	public static void main (String args [])
	{
		LinkedList obj = new LinkedList();

		//assert(size()==0);

		//System.out.print("The test cases are passed");
		list.addFirst(96);
		list.addLast(56);

		assert (list.isEmpty(96)==false);
		assert (list.first()==96);
		assert (list.last()==56);
		assert (list.removFirst()==96);
		assert (list.first()==96);


		System.out.print("The test cases are passed");
	}
}