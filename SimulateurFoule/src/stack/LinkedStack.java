package stack;

import java.util.Iterator;

import algo.linkedlist.nodes.interfaces.ILinkSimple;
import algo.stack.exception.StackEmptyException;
import algo.stack.interfaces.ILifo;

public class LinkedStack<V> implements ILifo {

	private LinkSimple<V> list;
	private MyIterator ite;

	public Iterator iterator() {
		// TODO Auto-generated method stub
		ite = new MyIterator(list);
		return (Iterator) ite;
	}

	public boolean isEmpty() {
		if (list == null || list.getValue() == null)
			return true;
		return false;
	}

	public Object peek() throws StackEmptyException {
		if (list != null) {
			while (ite.hasNext()) {
				if (ite.hasNext() == false) {
					Object value = list.getValue();
					list.setValue(null);
					return value;
				} else
					ite.next();
			}
			return list.getValue();
		} else
			return null;
	}

	public Object pop() throws StackEmptyException {
		if (list != null) {
			while (ite.hasNext()) {
				ite.next();
				if (ite.hasNext() == false)
					return list.getValue();
			}
			return list.getValue();
		}
		return null;
	}

	public void push(Object o) {
		// TODO Auto-generated method stub
		LinkSimple<V> l = new LinkSimple(o);
		
		/*
		if (ite.getList().getValue() != null) {
			ite.getList().setValue(o);
		}
		*/

		if (list != null) {
			while (ite.hasNext()) {
				System.out.println("next");
				ite.next();
			}
			//ite.getList().setNext((ILinkSimple<?>) l);
		} else {
			System.out.println("test");
			list = new LinkSimple(o);
			ite.setIndex(ite.getIndex() + 1);
		}
	}

	public int size() {
		int i = 0;
		System.out.println("- " + ite.getList().getValue());
		System.out.println("- " + ite.getList().getNext());

		while (ite.hasNext()) {
			System.out.println("-" + ite.getList().getValue());
			ite.next();
			i++;
		}
		return i;
	}

}
