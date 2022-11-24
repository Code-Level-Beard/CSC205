package projects.project5;

import java.util.ArrayList;
import java.util.Iterator;

public class MyBag<T> implements Bag<T> {
	
	ArrayList<T> MyBag;
	
	public MyBag() {
		super();
		MyBag = new ArrayList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return MyBag.iterator();
	}

	@Override
	public boolean isEmpty() {
		if (MyBag.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		return MyBag.size();
	}

	@Override
	public void add(T item) {
		MyBag.add(item);
	}
}
