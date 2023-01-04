package lk.ise.pos.db;

import lk.ise.pos.entity.User;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 12/31/2022
 **/

public class Database {
    public static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("Kamal", encryptPassword("1234")));
        users.add(new User("Nimal", encryptPassword("1234")));
        users.add(new User("Hemru", encryptPassword("1234")));
        System.out.println(users);
    }

    private static String encryptPassword(String rowPassword){

        return BCrypt.hashpw(rowPassword,BCrypt.gensalt());

    }
}
