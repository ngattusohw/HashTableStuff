
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
		

		tab.insert("First");
		System.out.println(tab.getSize());
		System.out.println(tab.getCapacity());

		tab.insert("Second");
		System.out.println(tab.getSize());
		System.out.println(tab.getCapacity());

		tab.insert("Third");
		System.out.println(tab.getSize());
		System.out.println(tab.getCapacity());

		tab.insert("wow");
		tab.insert("this");
		tab.insert("sucks");
		tab.insert("weed");
		tab.insert("keed");
		tab.insert("feed");


		System.out.println(tab.search("First"));
		System.out.println(tab.search("Second"));
		System.out.println(tab.search("Third"));
		System.out.println(tab.search("damn"));
		System.out.println(tab.search("wow"));
		System.out.println(tab.search("this"));
		System.out.println(tab.search("sucks"));
		System.out.println(tab.search("weed"));
		System.out.println(tab.search("keed"));
		System.out.println(tab.search("feed"));
		System.out.println(tab.getSize());
	}
}




