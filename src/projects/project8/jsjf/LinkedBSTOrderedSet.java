package projects.project8.jsjf;

import java.util.Iterator;


public class LinkedBSTOrderedSet<T>  implements OrderedSetADT<T>{

	LinkedBinarySearchTree<T> tree;

	public LinkedBSTOrderedSet() {
		super();
		tree = new LinkedBinarySearchTree<T>();
	}

	@Override
	public void addElement(T element) {
		if (tree.contains(element) != true) {
			tree.addElement(element);
		}
	}

	@Override
	public T removeElement(T targetElement) {
		return tree.removeElement(targetElement);
	}

	@Override
	public T find(T targetElement) {
		return tree.find(targetElement);
	}

	@Override
	public T findMin() {
		return tree.findMin();
	}

	@Override
	public T findMax() {
		return tree.findMax();
	}

	@Override
	public boolean contains(T targetElement) {
		return tree.contains(targetElement);
	}

	public boolean isEmpty() {
		return tree.isEmpty();
	}


	@Override
	public Iterator<T> iterator() {
		return tree.iterator();
	}

	@Override
	public String toString() {
		return tree.toString();
	}
}
