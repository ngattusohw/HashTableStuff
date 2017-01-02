


public class myHashTableTest{
	public static void main(String[] args) {
		HashTable<String> tab = new HashTable<String>(2);
		System.out.println("Size: " + tab.getSize() + " Capacity: " +
							tab.getCapacity());
		tab.insert("damn");
		System.out.println("Size: " + tab.getSize() + " Capacity: " +
							tab.getCapacity());
		tab.insert("first");
		System.out.println("Size: " + tab.getSize() + " Capacity: " +
							tab.getCapacity());
		tab.insert("second");
		System.out.println("Size: " + tab.getSize() + " Capacity: " +
							tab.getCapacity());
		tab.insert("third");
		System.out.println("Size: " + tab.getSize() + " Capacity: " +
							tab.getCapacity());
		

		// tab.insert("First");
		// System.out.println(tab.getSize());
		// System.out.println(tab.getCapacity());

		// tab.insert("Second");
		// System.out.println(tab.getSize());
		// System.out.println(tab.getCapacity());

		// tab.insert("Third");
		// System.out.println(tab.getSize());
		// System.out.println(tab.getCapacity());


		// System.out.println(tab.search("First"));
		// System.out.println(tab.search("Second"));
		// System.out.println(tab.search("Third"));
		// System.out.println(tab.search("damn"));
	}
}