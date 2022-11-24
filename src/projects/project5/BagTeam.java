package projects.project5;

import java.util.Iterator;

public class BagTeam<T> implements Team<T> {
	
	MyBag<T> BagTeam;
	
	public BagTeam() {
		super();
		BagTeam = new MyBag<T>();
	}

	@Override
	public Iterator<T> iterator() {
		return BagTeam.iterator();
	}

	@Override
	public void add(T item) {
		BagTeam.add(item);
	}

	@Override
	public boolean isEmpty() {
		if (BagTeam.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		return BagTeam.size();
	}

}
