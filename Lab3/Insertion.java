import java.util.Scanner;
public class Insertion{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Array length: ");
		int n = s.nextInt();

		int ar[] = new int[n];
		System.out.println("Enter the elements: ");

		for(int i=0; i<n; i++)
		{
			ar[i] = s.nextInt();
		}
		System.out.println("Unsorted array:");
		for (int f=0; f<ar.length;f++){
			System.out.println(ar[f]);

		}
		 int i,j,k;
		 for(i=1; i<n; i++)
		 {
		 	k=ar[i];
		 	j=i-1;
		 	while (j>=0 && ar[j] > k)
		 	{
		 		ar[j+1] = ar[j];
		 		j=j-1;
		 	}
		 	ar[j+1]=k;
		 }
		 System.out.print("Sorted array: ");
		 for (int sc=0; sc<ar.length;sc++){
		 	System.out.println(ar[sc]);
		 }
	}
}
