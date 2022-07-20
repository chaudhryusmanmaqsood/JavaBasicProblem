package ArrayList;

import java.util.ArrayList;
import java.util.List;

class User{
        int id;
        String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public User(){

        }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}



public class AddObjectInList {
    public static void main(String[] args) {
        User user1 = new User(1,"Usman","Lahore");
        User user2 = new User(2,"Salman","Lahore");
        User user3 = new User(3,"Furqan","Lahore");
        User user4 = new User(4,"Jawad","Lahore");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println(list);
        for ( User user:list)
        {
            System.out.println(user);
        }
    }

}
