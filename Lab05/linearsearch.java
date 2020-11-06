public class linearsearch{
	public static int linearsearch(int[] array, int x){
		int n=array.length;
		for(int i=0; i<n; i++){
			if(array[i]==x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []array = {5, 6, 3, 1, 8, 9};
		int x=7;
		int display= linearsearch(array,x);
		if(display == 1){
			System.out.println("target element not found!");
		}
		else{
			System.out.println("target element found!");
		}
	}
}