package IteratorAndCompositePattern.pancake;

public class DinerMenuIterator implements Iterator{
	MenuItem[] items;
	int position = 0;
	
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	// array¿Í list Ä¸½¶È­
	@Override
	public boolean hasNext() {
		 if(position >= items.length || items[position] == null) {
			 return false;
		 }else {
			 return true;
		 }
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	public MenuItem[] getItems() {
		return items;
	}

	public void setItems(MenuItem[] items) {
		this.items = items;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
