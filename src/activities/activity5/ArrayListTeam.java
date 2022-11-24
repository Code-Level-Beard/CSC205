package activities.activity5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTeam<T> implements Team<T> {
	
	ArrayList<T> ArrayListTeam;
	
	public ArrayListTeam() {
		super();
		ArrayListTeam = new ArrayList<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return ArrayListTeam.iterator();
	}

	@Override
	public boolean isEmpty() {
		if (ArrayListTeam.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		return ArrayListTeam.size();
	}

	@Override
	public void add(T item) {
		ArrayListTeam.add(item);
	}

	@Override
	public String toString() {
		return "";
	}
}