package heap;
//Implement a hash table using linear probing with a table size of 10 and a hash function of x % 10 for indexing. 
//The hash table should efficiently store and retrieve key-value pairs.
public class Assignment_Heap_19Oct {

	private final int SIZE = 10;
	private int[] table;
	private boolean[] occupied;

	public Assignment_Heap_19Oct() {
		table = new int[SIZE];
		occupied = new boolean[SIZE];
	}

	private int hasFunction(int key) {
		return key % SIZE;
	}

	public void insert(int Key) {
		int hashIndex = hasFunction(Key);

		while (occupied[hashIndex]) {
			hashIndex = (hashIndex + 1) % SIZE;
		}
		table[hashIndex] = Key;
		occupied[hashIndex] = true;

	}

	public boolean search(int Key) {

		int hashIndex = hasFunction(Key);
		int startIndex = hashIndex;
		
		while(occupied[hashIndex]) {
			if(table[hashIndex]==Key)
			{
				return true;
			}
			hashIndex = (hashIndex +1) % SIZE;
			if(hashIndex == startIndex)
			{
				break;
			}
		}
		return false;
	}
	public void display()
	{
		for(int i=0;i<SIZE;i++)
		{
			if(occupied[i])
			{
				System.out.println("Index"+i+":"+table[i]);
			}
			else {
				System.out.println("Index"+i+":Empty");
			}
		}
	}
	public static void main(String[] args) {
	
		Assignment_Heap_19Oct hashtable = new Assignment_Heap_19Oct();
		hashtable.insert(23);
		hashtable.insert(12);
		hashtable.insert(31);
		hashtable.insert(14);
		hashtable.insert(56);
		hashtable.insert(78);
		hashtable.insert(90);
		hashtable.insert(89);
		
		hashtable.display();
		
		System.out.println("Searching 31:"+hashtable.search(31));
		System.out.println("Searching 420:"+hashtable.search(420));
	}
}
