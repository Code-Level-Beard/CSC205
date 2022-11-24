package exercises.lists;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class OrderedListClass<T extends Comparable<T>> implements Iterable<T>{
	
	private ListNode<T> head;
	private ListNode<T> tail;
	private int size;
	
	private class ListNode<E> {
		private E element;
		private ListNode<E> next;
		
		public ListNode(E element, ListNode<E> next) {
			this.element = element;
			this.next = next;
		}
	}
	
	public OrderedListClass() {
		super();
		size = 0;
		head = tail = null;
	}
	
	public void add(T elementToAdd)	{
		if(isEmpty() || elementToAdd.compareTo(head.element) <= 0) {
			addToFront(elementToAdd);
		}
		else {
			ListNode<T> current = head;
			Boolean found = false;
			
			while ((current.next != null) && found == false) {
				if (elementToAdd.compareTo(current.next.element) <= 0)	{
					found = true;
					ListNode<T> newNode = new ListNode<T>(elementToAdd, current.next);
					current.next = newNode;
				}
				current = current.next;
			}
			if (found == false) {
				addToRear(elementToAdd);
			}
		}
	}
	
	private void addToFront(T elementToAdd) {
		// Create a new node that has the old head as its next
		ListNode<T> newNode = new ListNode<T>(elementToAdd, head);
		
		// The head should now refer to the new node (the new head)
		head = newNode;
		
		// If the the list was empty, this is the only node so it is also the tail!
		if (isEmpty()) {
			tail = newNode;
		}
		size++;
	}
	
	private void addToRear(T elementToAdd) {
		if(isEmpty()) {
			addToFront(elementToAdd);
		}
		else {
			// Create a new node with a null next
			ListNode<T> newNode = new ListNode<T>(elementToAdd, null);
		
			// The new node will follow the existing tail
			tail.next = newNode;
			
			// Set the tail to the new node
			tail = newNode;
			
			size++;
		}
	}

	public T removeFirst() {
		// Check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty OrderedList");
		}
		
		// Get the element from the head node
		T ret = head.element;
		
		// Set the head to the old head's next
		ListNode<T> oldHead = head;
		head = head.next;   // Set the new head
		
		// Clear the reference in the old head node
		oldHead.element = null;
		oldHead.next = null;
		
		size --;
		
		if(isEmpty()) {
			tail = null;     // The tail should be null if the list is empty
		}
		return ret;
	}
	
	public T removeLast() {
		// Check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty OrderedList");
		}
		
		// Get the element from the tail node
		T ret = tail.element;
		
		if (size==1) {
			ret = removeFirst();
		}
		else {
			// Traverse the list to find the next-to-last node which will
			//  become the new tail.  The next-to-last node will have 
			//  next = tail
			ListNode<T> newTail = head;  // Start looking at the tail
			while (newTail.next != tail) {
				newTail=newTail.next;
			}
			// At this point, new tail is referring to the next-to-last node
			
			// Clear the old tail
			ListNode<T> oldTail = tail;
			oldTail.element = null;
			oldTail.next = null;
			
			// Set the tail to the new tail
			tail = newTail;
			tail.next = null;  // This was pointing to the old tail
			size --;
		}
		return ret;
	}
	
	public Boolean contains(T value) {
		Boolean found = false;
		
		// Traverse the list, checking each node
		ListNode<T> current = head;
		while ((current != null) && !(found)) {
			// Check if the current node holds the element
			found = current.element.equals(value);  
			current = current.next;
		}
		return found;
	}
	
	public int indexOf(T value) {
		int ret = -1;
		int index = 0;
		
		// Traverse the list, checking each node
		ListNode<T> current = head;
		while (current != null) {
			if (current.element.equals(value)) {
				ret = index;
				break;
			}
			current = current.next;
			index ++;
		}
		return ret;
	}
	
	public boolean isEmpty() {
		return (size==0);
	}
	
	public int size() {
		return size;
	}
	
	public T first() {
		// Check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty OrderedList");
		}
		return head.element;
	}
	
	public T last() {
		// Check if the list is empty
		if (isEmpty()) {
			throw new NoSuchElementException("Empty OrderedList");
		}
		return tail.element;
	}
	
	@Override
	public String toString() {
		String ret = "head -> ";
		
		// Traverse the list
		ListNode<T> current = head;    // First element in the list
		while (current != null) {
			ret += current.element + " -> ";
			current = current.next;   // Moves to the next node
		}
		return ret + "tail";
	}

	@Override
	public Iterator<T> iterator() {
		return new OrderedListIterator<T>(head);
	}
	
	private class OrderedListIterator<E> implements Iterator<E> {

		private ListNode<E> current;
		
		public OrderedListIterator(ListNode<E> current) {
			super();
			this.current = current;
		}

		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			// First check if there is anything left
			if (!(hasNext())) {
				return null;
			}
			E ret = current.element;
			current = current.next;
			return ret;
		}
	}

}
