package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class customer extends person {

    private ArrayList<menu_item> customer_order;

    customer(String first_name, String last_name) {

        super(first_name, last_name);

    }

    customer(String first_name, String last_name, ArrayList<menu_item> customer_order) {

        super(first_name, last_name);

        this.customer_order = new ArrayList<menu_item>();

        Iterator<menu_item> item_copy = customer_order.iterator();
        while(item_copy.hasNext()) {

            //this.customer_order.add()

        }



    }

    public void add_menuItem() {



    }

}
