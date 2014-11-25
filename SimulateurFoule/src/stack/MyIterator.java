package stack;

import java.util.Iterator;

public class MyIterator implements Iterator{

	private LinkSimple<?> list;
	private int index;
	
	public MyIterator(LinkSimple<?> list){
		this.list = list;
		this.index=0;
	}

	public boolean hasNext() {
		if(this.list.getNext()!=null)
			return true;
		else
			return false;
	}

	public Object next() {
		index++;
		return this.list.getNext();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public LinkSimple<?> getList() {
		return list;
	}

	public void setList(LinkSimple<?> list) {
		this.list = list;
	}

	//Implémentation de remove à faire !
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	
}
