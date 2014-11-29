package stack;

import algo.linkedlist.nodes.interfaces.ILinkSimple;

public class LinkSimple<V> implements ILinkSimple<V> {
	
	private V value;
	private ILinkSimple<V> next;
	
	public LinkSimple(V v){
		this.value = v;
	}
	
	public ILinkSimple<V> getNext() {
		return next;
	}

	public V getValue() {
		return value;
	}

	public void setNext(ILinkSimple<V> l) {
		next = l;
	}

	public void setValue(V o) {
		value = o;
	}

}
