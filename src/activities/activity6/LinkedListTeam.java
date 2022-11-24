package activities.activity6;

import java.util.Iterator;

import activities.activity5.Team;

public class LinkedListTeam<T> implements Team<T> {
	
	LinkedList<T> LinkedListTeam;
	
	public LinkedListTeam() {
		super();
		LinkedListTeam = new LinkedList<T>();
	}

	@Override
	public void add(T elementToAdd) {
		LinkedListTeam.addToRear(elementToAdd);
	}

	@Override
	public Iterator<T> iterator() {
		return LinkedListTeam.iterator();
	}

	@Override
	public boolean isEmpty() {
		if (LinkedListTeam.isEmpty() == true) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		return LinkedListTeam.size();
	}
	
	@Override
	public String toString() {
		return LinkedListTeam.toString();
	}
}
