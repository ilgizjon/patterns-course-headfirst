package HeadFirst.Iterator;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menu;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem>list){
        this.menu = list;
    }

    @Override
    public boolean hasNext() {
        return menu.size()>position;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menu.get(position);
        position++;
        return menuItem;
    }

}
