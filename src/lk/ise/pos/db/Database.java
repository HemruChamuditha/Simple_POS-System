package lk.ise.pos.db;
import lk.ise.pos.entity.Customers;
import lk.ise.pos.entity.Item;
import lk.ise.pos.entity.User;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 12/31/2022
 **/

public class Database {
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Customers> customers = new ArrayList<Customers>();
    public static ArrayList<Item> items = new ArrayList<>();

    static {

        users.add(new User("Kamal", encryptPassword("1234")));
        users.add(new User("Nimal", encryptPassword("1234")));
        users.add(new User("Hemru", encryptPassword("1234")));

        Item item1 = new Item("001", "des1", "25",3500);
        Item item2 = new Item("002","des2","45",1233);
        Item item3 = new Item("003","des3","9",6777);

        customers.add(new Customers("C001", "Kavindu", "Colombo", 40000));
        customers.add(new Customers("C002", "Jagath", "Jaffna", 43000));
        customers.add(new Customers("C003", "sunil", "Colombo", 40000));

        items.addAll(
                Arrays.asList(item1,item2,item3)
        );
    }

    private static String encryptPassword(String rowPassword){
        return BCrypt.hashpw(rowPassword,BCrypt.gensalt());
    }


}
