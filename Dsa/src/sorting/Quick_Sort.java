package sorting;

public class Quick_Sort {

	static void quick_sort(int a[], int start, int end)

	{

		int i = start;

		int j = end;

		int pivot = end;

		while (i < j)

		{
			while (a[i] < a[pivot])

				i++;

			while (a[j] > a[pivot])

				j--;

			if (i < j)

			{

				int temp = a[i];

				a[i] = a[j];

				a[j] = temp;

			}

		}

		if (i < end)

			quick_sort(a, i + 1, end);

		if (j > start)

			quick_sort(a, start, j - 1);

	}

	public static void main(String[] args) {
		int a[] = { 77, 88, 44, 99, 33, 55, 66, 22, 11 };
		quick_sort(a, 0, a.length - 1);

		System.out.println("Sorted array:");
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
