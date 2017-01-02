public class myLinkedListTest{

	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<String>();
		list.pushFront("Hello");
		list.printElements();
		System.out.println(list.getSize());

		list.pushFront("World");
		list.printElements();
		System.out.println(list.getSize());

		list.pushBack("Asswipe");
		list.printElements();
		System.out.println(list.getSize());

		list.popFront();
		list.printElements();
		System.out.println(list.getSize());

		list.popBack();
		list.printElements();
		System.out.println(list.getSize());

	}

}