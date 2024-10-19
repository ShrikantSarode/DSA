package heap;
//Implement a hash table using linear probing with a table size of 10 and a hash function of x % 10 for indexing.
//The hash table should efficiently store and retrieve key-value pairs.
public class HeapDemo1 {

	void heap_sort(int a[])

	{

		int i, j, current;

		boolean done;

		for (i = a.length - 1; i > 0; i--)// everytime one element is reduced

		{

			for (j = 0; j <= i; j++)// current will go j to till zero

			{

				current = j;

				done = true;

				while (current > 0 && current / 2 >= 0 && done == true)

				{

					if (a[current] / 2 < a[current])// parent<child

					{

						int temp = a[current / 2];

						a[current / 2] = a[current];

						a[current] = temp;

						current = current / 2;// move to parent

					}

					else

						done = false;

				} // while

			} // for j

			// swap 0th with ith

			int temp = a[0];

			a[0] = a[i];

			a[i] = temp;

		} // for i

	}// code-
}
