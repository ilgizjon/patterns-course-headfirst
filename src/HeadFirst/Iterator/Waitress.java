package HeadFirst.Iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Waitress {
    ArrayList<Menu>menus;

    public Waitress(ArrayList<Menu>menus){
        this.menus = menus;
    }

    public void printMenu(){
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(java.util.Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + "," );
            System.out.print(menuItem.getPrice() + "-- ");
            System.out.println(menuItem.getDescription());
        }
    }
}