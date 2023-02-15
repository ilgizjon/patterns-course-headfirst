package HeadFirst.Iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(){ }

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (list[position-1] != null) {
            if (list.length - 1 - (position - 1) >= 0)
                System.arraycopy(list, position - 1 + 1, list, position - 1, list.length - 1 - (position - 1));
            list[list.length-1] = null;
        }
    }

}