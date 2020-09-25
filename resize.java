public class resize{
	static int[] array;
	public static int[] resize(int length) {
		int[] num= new int [length];
		for (int i=0; i<array.length; i++) {
		num[i]=array[i];
	}
		num[length -1]=4;
		array=num;
		return array;
	}
	public static void main(String[] args) {
		array= new int[3];
		array[0]= 1;
		array[1]= 2;
		array[2]=3;
		int[] num= resize(4);
		for (int i=0; i<num.length; i++) {
		System.out.println(array[i]);
		}
	}
}
