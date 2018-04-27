import java.util.ArrayList;

public class MediaCollection
{
    private ArrayList<Item> items;
    
    public MediaCollection() {
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void showAllShortDescriptions() {
        for (Item item : items) {
            System.out.println(item.getShortDescription());
            System.out.println();
        }
    }
    
    public void showAllLongDescriptions() {
        for (Item item : items) {
            System.out.println(item);
            System.out.println();
        }
    }
}