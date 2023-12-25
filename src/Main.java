import models.Item;
import models.Order;
;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "jacket", 1200);
        Item item2 = new Item(2, "sock", 100);
        Item item3 = new Item(3, "pen", 20);

        List<Item> order1Items = List.of(item1, item2, item3);
        List<Item> order2Items = List.of(item2, item3, item1);
        List<Item> order3Items = List.of(item3, item1, item2);

        Order order1 = new Order(101, order1Items);
        Order order2 = new Order(102, order2Items);
        Order order3 = new Order(103, order3Items);


        System.out.println("Total Order is : " + item1.getName() +", "+item2.getName()+", "+ item3.getName()+", "+order1.TotalOrder());

    }
}