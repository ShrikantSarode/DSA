package sorting;

public class Bubble_Sort {

	static void print_array(int a[]) {
		System.out.println("Array Has:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " , ");
		}
	}
	
	static void bubble_sort(int a[])
	{
		int temp,i;
		
		for ( i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nBubble Sort:");
		print_array(a);
	}
	

	public static void main(String[] args) {

		int a[] = { 77, 88, 44, 99, 33, 55, 66, 22, 11 };
		print_array(a);
		bubble_sort(a);

	}
}
