


/**
*HashTable implementation with single LinkedList as elements
*
*NEEDS array of linkedlist, hash function, size, load factor
*@since 01-01-17
**/

public class HashTable<T>{
	private LinkedList<T>[] table;
	private int size;
	private int capacity;
	private double load = 0.75;

	@SuppressWarnings("unchecked")
	public HashTable(int c){
		size = 0;
		capacity = c;
		table = new LinkedList[c];

		for(int x=0;x<c;x++){
			table[x] = new LinkedList<T>();
		}
	}

	public HashTable(){
		this(50);
	}

	public int getCapacity(){
		return capacity;
	}

	public int getSize(){
		return size;
	}

	public void insert(T elem){
		increment();
		int loc = hash(elem) % capacity;
		table[loc].pushFront(elem);

		if((double)size/(double)capacity > load){
			System.out.println("Resizing now..." + size + " " + capacity
				+ " " + (double)size/capacity);
			adjust();
		}

	}

	public int hash(T elem){
		return Math.abs(elem.hashCode());
	}

	public void adjust(){
		int prevCap = capacity;
		capacity*=2;

		//make a newTable and instanziate the LinkedLists
		LinkedList<T>[] newTable = new LinkedList[capacity];
		for(int z=0;z<capacity;z++){
			newTable[z] = new LinkedList<T>();
		}
		for(int x=0;x<prevCap;x++){
			int temp_size = table[x].getSize();
			for(int y=0;y<temp_size;y++){
				T holdElem = table[x].popFront();
				int loc = hash(holdElem) % capacity;
				newTable[loc].pushBack(holdElem);
			}
		}

		table = newTable;
	}

	public void increment(){
		size++;
	}

	public void decrement(){
		size--;
	}

	public boolean search(T elem){
		int index = hash(elem) % capacity;
		return table[index].searchList(elem);
	}
}
