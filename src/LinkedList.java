
public class LinkedList implements LinkedListInterface {

	Node start = null;
	Node end = null;

	int size = 0;

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public void addFirst(Object data) {
		start = new Node(data, start);
		size++;
	}

	@Override
	public void addLast(Object data) {
		Node current = start;
		size++;
		if (start == null) {
			start = new Node(data, null);
		} else {
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node(data, null));
		}

	}

	@Override
	public void add(Object data, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

	}

	public String toString() {
		String bigboy = "";
		Node current = start;

		while (current != null) {
			bigboy += current.getData();
			current = current.getNext();
		}

		System.out.println(bigboy);
		return bigboy;

	}

}
