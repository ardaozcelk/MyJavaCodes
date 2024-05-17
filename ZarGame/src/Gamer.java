import java.util.HashMap;
import java.util.Random;

public class Gamer {
    private String name;
    private String surname;
    private int point;

    public Gamer () {}
    public Gamer (String name,String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getPoint() {
        return point;
    }

    public void ZarAt() {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,4);
        map.put(2,8);
        map.put(3,12);
        map.put(4,16);
        map.put(5,20);
        map.put(6,25);
        Random random = new Random();
        int roll = random.nextInt(6)+1;
        point = point + map.get(roll);
    }
}
